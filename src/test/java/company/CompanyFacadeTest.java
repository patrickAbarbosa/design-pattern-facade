package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyFacadeTest {
    @Test
    public void shouldIsActive() {
        Lamp lampA = new Lamp();
        Lamp lampB = new Lamp();

        Lamp lampList[] = { lampA, lampB };
        LampGroup lampGroup = new LampGroup("GroupName", lampList);
        LampGroup lampGroupList[] = { lampGroup };

        CompanyFacade companyFacade = new CompanyFacade(false, lampGroupList);

        companyFacade.turnOn();

        assertEquals("{machine: true, lampGroup: true, airConditioner: true}", companyFacade.getIsActiveToString());
    }

    @Test
    public void shouldIsNotActive() {
        Lamp lampA = new Lamp();
        Lamp lampB = new Lamp();

        Lamp lampList[] = { lampA, lampB };
        LampGroup lampGroup = new LampGroup("GroupName", lampList);
        LampGroup lampGroupList[] = { lampGroup };

        CompanyFacade companyFacade = new CompanyFacade(false, lampGroupList);

        companyFacade.turnOff();

        assertEquals("{machine: false, lampGroup: false, airConditioner: false}", companyFacade.getIsActiveToString());
    }

    @Test
    public void shouldFailActiveCompany() {
        Lamp lampA = new Lamp();
        Lamp lampB = new Lamp();

        Lamp lampList[] = { lampA, lampB };
        LampGroup lampGroup = new LampGroup("GroupName", lampList);
        LampGroup lampGroupList[] = { lampGroup };

        CompanyFacade companyFacade = new CompanyFacade(true, lampGroupList);

        companyFacade.turnOffAirConditioner();

        assertEquals(false, companyFacade.getIsActive());
    }

    @Test
    public void shouldFailWhenTryingActivateAirConditioner() {
        try {
            Lamp lampA = new Lamp();
            Lamp lampB = new Lamp();

            Lamp lampList[] = { lampA, lampB };
            LampGroup lampGroup = new LampGroup("GroupName", lampList);
            LampGroup lampGroupList[] = { lampGroup };

            CompanyFacade companyFacade = new CompanyFacade(true, lampGroupList);

            companyFacade.turnOnAirConditioner(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid temperature!", e.getMessage());
        }
    }
}
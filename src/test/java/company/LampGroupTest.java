package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LampGroupTest {
    @Test
    public void shouldTurnOnLamps() {
        Lamp lampA = new Lamp();
        Lamp lampB = new Lamp();
        Lamp lampC = new Lamp();

        Lamp lampList[] = { lampA, lampB, lampC};

        LampGroup lampGroup = new LampGroup("group 1", lampList);

        lampGroup.turnOn();

        assertEquals(true, lampGroup.getIsActive());
    }

    @Test
    public void shouldTurnOffLamps() {
        Lamp lampA = new Lamp();
        Lamp lampB = new Lamp();
        Lamp lampC = new Lamp();

        Lamp lampList[] = { lampA, lampB, lampC};

        LampGroup lampGroup = new LampGroup("group 1", lampList);

        lampGroup.turnOff();

        assertEquals(false, lampGroup.getIsActive());
    }

    @Test
    public void shouldBeName() {
        Lamp lampA = new Lamp();

        Lamp lampList[] = { lampA};

        LampGroup lampGroup = new LampGroup("group 1", lampList);

        assertEquals("group 1", lampGroup.getName());
    }

    @Test
    public void shouldFailName() {
        try {
            Lamp lampA = new Lamp();

            Lamp lampList[] = { lampA};

            LampGroup lampGroup = new LampGroup("gr", lampList);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name!", e.getMessage());
        }
    }
}
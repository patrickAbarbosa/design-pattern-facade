package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
    public void shouldBeAtTemperature() {
        AirConditioner airConditioner = new AirConditioner(16, true);

        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    public void shouldBeActive() {
        AirConditioner airConditioner = new AirConditioner(16, true);

        assertEquals(true, airConditioner.getIsActive());
    }

    @Test
    public void shouldFailSetTemperature() {
        try {
            AirConditioner airConditioner = new AirConditioner(14, true);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid temperature!", e.getMessage());
        }
    }
}
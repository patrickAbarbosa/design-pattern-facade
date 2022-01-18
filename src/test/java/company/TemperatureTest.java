package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    public void shouldBeSingleInstance() {
        assertNotNull(Temperature.getInstance().getTemperature());
    }
}
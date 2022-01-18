package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LampTest {
    @Test
    public void shouldBeOn() {
        Lamp lamp = new Lamp();
        lamp.setIsActive(true);

        assertEquals(true, lamp.getIsActive());
    }

    @Test
    public void shouldBeOff() {
        Lamp lamp = new Lamp();
        lamp.setIsActive(false);

        assertEquals(false, lamp.getIsActive());
    }
}
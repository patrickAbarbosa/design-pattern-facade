package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MachineTest {
    @Test
    public void shouldBeOn() {
        Machine machine = new Machine();
        machine.setIsActive(true);

        assertEquals(true, machine.getIsActive());
    }

    @Test
    public void shouldBeOff() {
        Machine machine = new Machine();
        machine.setIsActive(false);

        assertEquals(false, machine.getIsActive());
    }
}
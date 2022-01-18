package company;

import java.util.ArrayList;

public class LampGroup {
    String name;
    Lamp lampList[];

    public LampGroup(String name, Lamp lampList[]) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Invalid name!");
        }

        this.name = name;
        this.lampList = lampList;
    }

    public void turnOn() {
        for (Lamp lamp : lampList) {
            lamp.setIsActive(true);
        }
    }

    public void turnOff() {
        for (Lamp lamp : lampList) {
            lamp.setIsActive(false);
        }
    }

    public Boolean getIsActive() {
        for (Lamp lamp : lampList) {
            if (!lamp.getIsActive()) {
                return false;
            }
        }

        return true;
    }

    public String getName() {
        return this.name;
    }
}

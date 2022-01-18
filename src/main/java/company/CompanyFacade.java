package company;

public class CompanyFacade {
    LampGroup lampGroup[];
    Machine machine;
    AirConditioner airConditioner;

    public CompanyFacade(Boolean isActive, LampGroup lampGroup[]) {
        this.lampGroup = lampGroup;

        if (!isActive) {
            for (LampGroup group : this.lampGroup) {
                group.turnOff();
            }
        }

        this.machine = new Machine();
        airConditioner = new AirConditioner(23, isActive);
        Temperature.getInstance();
    }

    public void turnOnLamp() {
        for (LampGroup group : this.lampGroup) {
            group.turnOn();
        }
    }

    public void turnOffLamp() {
        for (LampGroup group : this.lampGroup) {
            group.turnOff();
        }
    }

    public void turnOnMachine() {
        machine.setIsActive(true);
    }

    public void turnOffMachine() {
        machine.setIsActive(false);
    }

    public void turnOnAirConditioner(int temperature) {
        airConditioner.setIsActive(true);
        airConditioner.setTemperature(temperature);
    }

    public void turnOffAirConditioner() {
        airConditioner.setIsActive(false);
    }

    public void turnOn() {
        this.turnOnMachine();
        this.turnOnLamp();
        this.turnOnAirConditioner(22);
    }

    public void turnOff() {
        this.turnOffLamp();
        this.turnOffMachine();
        this.turnOffAirConditioner();
    }

    public Boolean lampGroupIsActive() {
        for (LampGroup group : this.lampGroup) {
            if (!group.getIsActive()){
                return false;
            }
        }

        return true;
    }

    public Boolean getIsActive () {
        return this.machine.getIsActive() && this.airConditioner.getIsActive() && this.lampGroupIsActive();
    }

    private String parseIsActiveToString(Boolean isActive) {
        return isActive ? "true" : "false";
    }

    public String getIsActiveToString() {
        String values[] = {
                "machine: " +  parseIsActiveToString(this.machine.getIsActive()),
                "lampGroup: " +  parseIsActiveToString(this.lampGroupIsActive()),
                "airConditioner: " +  parseIsActiveToString(this.airConditioner.getIsActive())
        };

        return "{" + String.join(", ", values) + "}";
    }
}

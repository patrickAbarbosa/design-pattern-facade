package company;

public class AirConditioner {
    int temperature;
    Boolean isActive;

    public AirConditioner(int temperature, Boolean isActive) {
        if (temperature < 16 || temperature > 30) {
            throw new IllegalArgumentException("Invalid temperature!");
        }

        this.temperature = temperature;
        this.isActive = isActive;
    }

    public void setTemperature(int temperature) {
        if (temperature < 16 || temperature > 30) {
            throw new IllegalArgumentException("Invalid temperature!");
        }

        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}

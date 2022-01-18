package company;

public class Temperature {
    int temperature;
    public static Temperature instance;

    public static Temperature getInstance() {
        if (instance == null) {
            instance = new Temperature();
        }

        return instance;
    }

    private Temperature() {
        this.temperature = (int)(Math.random() * 40 + 1);
    }

    public int getTemperature() {
        return temperature;
    }
}


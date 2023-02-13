package transport;

public abstract class Transport <T extends Driver>implements Сompeting {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    public Transport(String brand, String model, double engineVolume,T driver) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);

    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            engineVolume = 1.6;
        }
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public abstract void startMove();

    public abstract void finishMove();

    public void printInfo(){
        System.out.println("водитель "+driver.getName()+" управляет автомобилем"+getBrand()+" Б и будет участвовать в заезде");
    }


    @Override
    public String toString() {
        return
                "  " + brand + '\'' +
                ",  " + model + '\'' +
                "обьем двигателя " + engineVolume;
    }
}
package transport;

public class Bus extends Transport<DriverD> {


    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус"+ getBrand()+ " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус"+ getBrand()+ " закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит_стоп у автобуса");
    }

    @Override
    public void bestLapTime() {
        int minBound=100;
        int maxBound=150;
        int theBestTime=(int) ( minBound+ (maxBound-minBound) * Math.random());
        System.out.println("Лучшее время круга в мин : :"+ theBestTime);

    }

    @Override
    public void maxSpeed() {
        int minBound=80;
        int maxBound=120;
        int maxSpeed=(int) ( minBound+ (maxBound-minBound) * Math.random());
        System.out.println("Лучшая скорость для автобуса : :"+ maxSpeed);

    }
}

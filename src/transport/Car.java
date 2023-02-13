package transport;

public class Car extends Transport<DriverB> {


    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Машина "+getBrand()+ "начала движение");
    }

    @Override
    public void finishMove() {
        System.out.println("машина"+ getBrand()+ " закончила движение");

    }

    @Override
    public void pitStop() {
       System.out.println("Пит_стоп у легковой машины");
    }

    @Override
    public void bestLapTime() {
        int minBound=100;
        int maxBound=150;
        int theBestTime= (int) ( minBound+ (maxBound-minBound) * Math.random());
        System.out.println("Лучшее время круга в мин : :"+ theBestTime);

    }

    @Override
    public void maxSpeed() {
        int minBound=80;
        int maxBound=120;
        int maxSpeed= (int) ( minBound+ (maxBound-minBound) * Math.random());
        System.out.println("Лучшая скорость для лекговой машины : :"+ maxSpeed);
    }
}



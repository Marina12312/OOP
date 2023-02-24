package transport;

public class Bus extends Transport<DriverD> {


    public Bus(String brand, String model, double engineVolume, DriverD driver,BodyType bodyType) {
        super(brand, model, engineVolume, driver,Type.BUS);
    }

    @Override
    public void printType() {
        if (getType() != null) {
            System.out.println(getType());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
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
    public void passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException();
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
    public Type getType() {
        return Type.BUS;
    }

   private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public enum BodyType {
        VERY_SMALL(null, 10),
        SMALL(10, 25),
        AVERAGE(25, 50),
        LARGE(50, 80),
        VERY_LARGE(80, 120);

        Integer lowerBound;
        Integer upperBound;

        BodyType(Integer lowerBound, Integer upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        @Override
        public String toString() {
            return (lowerBound == null ? " " : " вместимость от = " + String.valueOf(lowerBound)) +
                    (upperBound == null ? " " : " до = " + String.valueOf(upperBound));
        }
    }
}

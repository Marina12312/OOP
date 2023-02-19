package transport;

public class Trukc extends Transport<DriverC>{

    public Trukc(String brand, String model, double engineVolume, DriverC driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver,Type.TRUCK);
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
        System.out.println("Грузовик"+getBrand()+ " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик"+getBrand()+ " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит_стоп у грузовой");
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
        System.out.println("Лучшая скорость для грузовой: :"+ maxSpeed);
    }
    public Type getType() {
        return Type.TRUCK;
    }

    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public enum BodyType {
        N1(null, 3.5F),
        N2(3.5F, 12F),
        N3(12F, null);

        private Float minMass;
        private Float maxMass;

        BodyType(Float minMass, Float maxMass) {
            this.minMass = minMass;
            this.maxMass = maxMass;
        }

        @Override
        public String toString() {
            return  (minMass == null ? " "  : " minMass= " + String.valueOf(minMass)) +
                    (maxMass == null ? " " : " maxMass= " + String.valueOf(maxMass)) +
                    '}';
        }
    }

}

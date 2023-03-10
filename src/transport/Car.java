package transport;

import java.util.List;

public class Car extends Transport<DriverB> {




    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver,Type.CAR,mechanicList);
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
        System.out.println("Машина "+getBrand()+ "начала движение");
    }

    @Override
    public void finishMove() {
        System.out.println("машина"+ getBrand()+ " закончила движение");

    }

    @Override
    public void passDiagnostics() throws TransportTypeException {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " проходит диагностику");
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
    @Override
    public Type getType() {
        return Type.CAR;
    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбэк"),
        COUPE("Купе"),
        ESTATE("Уневерсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");


        private String bodyType;


        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }
        @Override
        public String toString() {
            return ", тип кузова: " + bodyType +
                    " ";
        }


    }


    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}



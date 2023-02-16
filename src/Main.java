import transport.*;

public class Main {
    public static void main(String[] args) {
for (int i=1;i<4;i=i+1){
    DriverB driverB=new DriverB("Водитель В категории  № "+i,
            false,
            3+i);
    Car car=new Car("Легковая брэнд № "+i,
            "Легковая модель № "+i,
            1.6,
            driverB, Car.BodyType.SEDAN);

    DriverD driverD = new DriverD("Водитель D категории № "+i,
            false,
            3+i);
        Bus bus=new Bus("Автобус брэнд № "+i,
                "Автобус модель № "+i,
                1.4,
                driverD,Bus.BodyType.LARGE);

        DriverC driverC= new DriverC("Водитель С категории  № "+i,
                false,
                3+i);
    Trukc trukc =new Trukc("Грузовик брэнд № "+i,
            "Грузовик модель № "+i,
            2.0,
            driverC, Trukc.BodyType.N1);
    printInfo(car);
    printInfo(bus);
    printInfo(trukc);

}
    }
    private static void printInfo(Transport<?> transport){
        System.out.println(transport.getDriver().getName()+ " управляет автомобилем"+transport.getBrand()+"и будет участвовать в заезде");
    }
    }

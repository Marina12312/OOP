import transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i = i + 1) {
            Mechanic mechanic1 = new Mechanic(" Пётр", "МР");
            Mechanic mechanic2= new Mechanic("Вася","ПР");
            List<Mechanic> mechanicList= new ArrayList<>();
            mechanicList.add(mechanic1);
            mechanicList.add(mechanic2);
            DriverB driverB = new DriverB("Водитель В категории  № " + i,
                    false,
                    3 + i);
            Car car = new Car("Легковая брэнд № " + i,
                    "Легковая модель № " + i,
                    1.6,
                    driverB, Car.BodyType.SEDAN,mechanicList);

            DriverD driverD = new DriverD("Водитель D категории № " + i,
                    false,
                    3 + i);
            Bus bus = new Bus("Автобус брэнд № " + i,
                    "Автобус модель № " + i,
                    1.4,
                    driverD, Bus.BodyType.LARGE,mechanicList);

            DriverC driverC = new DriverC("Водитель С категории  № " + i,
                    false,
                    3 + i);

            Trukc trukc = new Trukc("Грузовик брэнд № " + i,
                    "Грузовик модель № " + i,
                    2.0,
                    driverC, Trukc.BodyType.N1,mechanicList);
            printInfo(car);
            printInfo(bus);
            printInfo(trukc);

            ServiceStation serviceStation = new ServiceStation();
            serviceStation.addAutoQueue(car);
            serviceStation.addAutoQueue(bus);
            serviceStation.addAutoQueue(trukc);
            serviceStation.carryOutMaintenance();
        }


    }

    private static void printInfo(Transport<?> transport) {
        System.out.println(transport.getDriver().getName() + " управляет автомобилем" + transport.getBrand() + "и будет участвовать в заезде");
    }
    public static void checkTransportDiagnostic(Transport<?> transports) {

        if (transports.getType().equals(Type.BUS)) {
            try {
                transports.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println("Автобусам не нужно проходить диагностику");
            }
        } else {
            try {
                transports.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println(" ");
            }
        }
    }
}
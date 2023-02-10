import transport.Bus;
import transport.Car;
import transport.Key;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(null, "Granta", 1.7, "желтого цвета", 2015, "сборка в России", 200, "ава", "434", 3, 3, true, new Key(true, true));
        Car car2 = new Car("Audi ", "A8 50 L TDI quattro", 3.0, "черный цвет кузова", 2020, "сборка в Германии", 32, "ава", "аа", 3, 32, false, new Key(true, false));
        Car car3 = new Car("BMW ", "Z8", 3.0, "черный цвет кузова", 2021, "сборка в Германии", 32, "ава", "434", 3, 34, false, new Key(true, false));
        Car car4 = new Car("Kia ", "Sportage 4-го поколения", 2.4, "цвет кузова — красный", 2018, "сборка в Южной Корее", 32, "ава", "434", 3, 34, false, new Key(true, false));
        Car car5 = new Car("Hyundai  ", "Avante", 1.6, "цвет кузова — оранжевый", 2016, "сборка в Южной Корее", 32, "ава", "434", 3, 34, false, new Key(true, false));
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        Bus bus1 = new Bus("Model", "brand", 32, "страна", "цвет", 323);
        Bus bus2 = new Bus("Model", "brand", 32, "страна", "цвет", 323);
        Bus bus3 = new Bus("Model", "brand", 32, "страна", "цвет", 323);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}
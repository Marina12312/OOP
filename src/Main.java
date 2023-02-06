public class Main {
    public static void main(String[] args) {
        Car car1 = new Car (null,"Granta",1.7f,"желтого цвета",2015,"сборка в России");
        Car car2 = new Car("Audi ","A8 50 L TDI quattro",3.0f,"черный цвет кузова",2020,"сборка в Германии");
        Car car3 = new Car("BMW ","Z8",3.0f,"черный цвет кузова",2021,"сборка в Германии");
        Car car4 = new Car("Kia ","Sportage 4-го поколения",2.4f,"цвет кузова — красный",2018,"сборка в Южной Корее");
        Car car5 = new Car("Hyundai  ","Avante",1.6f,"цвет кузова — оранжевый",2016,"сборка в Южной Корее");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
    }
}
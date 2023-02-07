import transport.Car;
import transport.Key;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car (null,"Granta",1.7,"желтого цвета",2015,"сборка в России"," ца","ава",434,3,true,new Key(true,false));
        Car car2 = new Car("Audi ","A8 50 L TDI quattro",3.0,"черный цвет кузова",2020,"сборка в Германии"," ца","ава",434,3,false,new Key(true,false));
        Car car3 = new Car("BMW ","Z8",3.0,"черный цвет кузова",2021,"сборка в Германии"," ца","ава",434,3,false,new Key(true,false));
        Car car4 = new Car("Kia ","Sportage 4-го поколения",2.4,"цвет кузова — красный",2018,"сборка в Южной Корее"," ца","ава",434,3,false,new Key(true,false));
        Car car5 = new Car("Hyundai  ","Avante",1.6,"цвет кузова — оранжевый",2016,"сборка в Южной Корее"," ца","ава",434,3,false,new Key(true,false));
       car1.print();
        car2.print();
        car3.print();
        car4.print();
        car5.print();
    }
}
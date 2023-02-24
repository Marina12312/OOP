package transport;

public class DriverB extends Driver{
    public DriverB(String name,
                   boolean hasDriverLicense,
                   int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории В "+ getName()+ " начало движения");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории В "+ getName()+ " стоп движения");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории В "+ getName()+ " заправляет авто");

    }
}

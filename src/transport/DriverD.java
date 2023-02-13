package transport;

public class DriverD extends Driver {
    public DriverD(String name,
                   boolean hasDriverLicense,
                   int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D "+ getName()+ " начало движения");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории D "+ getName()+ " стоп движения");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории D "+ getName()+ " заправляет авто");

    }
}

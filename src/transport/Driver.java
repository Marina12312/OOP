package transport;

public  abstract class Driver {
    private String name;
    private boolean hasDriverLicense;
    private int experience;

    public Driver(String name,
                  boolean hasDriverLicense,
                  int experience) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refuel();

}

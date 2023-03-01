package transport;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasDriverLicense== driver.hasDriverLicense && hasDriverLicense == driver.hasDriverLicense && Objects.equals(hasDriverLicense, driver.hasDriverLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasDriverLicense, experience);
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refuel();

}

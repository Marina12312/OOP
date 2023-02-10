package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private double maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, double maxSpeed ){
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand= brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model= model;
        this.year=year;
        this.country=country;
        setBodyColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double isMaxSpeed() {
        return maxSpeed;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isEmpty()) {
            bodyColor = "default";
        }
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 1.5;
        }

        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

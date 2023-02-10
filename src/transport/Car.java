package transport;

public class Car {
    private final String brand;
    private final String model;
   private double engineVolume;
   private String color;
    private final int year;
    private final String country;
   private String transmission;
    private final String bodyType;
   private double registrationNumber;
    private final int numberSeats;
  private   boolean rubber;
  private Key key;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType,
               double registrationNumber, int numberSeats, boolean rubber, Key key) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color = color;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;
        if (transmission == null || transmission.isEmpty()) {
            transmission = "default";
        }
        this.transmission = transmission;
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "default";
        }
        this.bodyType = bodyType;
        if (registrationNumber <= 0) {
            registrationNumber= 000000;
        }
        this.registrationNumber = registrationNumber;
        if (numberSeats <= 0) {
            numberSeats = 1;
        }
        this.numberSeats = numberSeats;
        this.rubber = rubber;
        this.key=key;
    }
    public void chekRubber() {
        int month = 2;
        switch (month) {
        case 1:
       case 2:
        case 12:
          if (getRubber() == !true) {
             System.out.println(" Смени шины на сезонные!");
        }
      break;
      case 6:
      case 7:
     case 8:
      if (getRubber() == !false) {
                System.out.println(" Смени шины на сезонные!");
        }
         break;
        default:
            break;
        }
    }

    private String getBrand() {
        return brand;
    }

    private String getModel() {
        return model;
    }

    private int getYear() {
        return year;
    }

    private String getCountry() {
        return country;
    }

    private String getBodyType() {
        return bodyType;
    }

    private int getNumberSeats() {
        return numberSeats;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public double getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(double registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean getRubber() {
        return rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }


    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, true);
        }

    }
    public void print() {
        System.out.println("Марка автомобиля:  " + getBrand() + ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + "л, цвет кузова: " + getColor() +
                ", год выпуска: " + getYear() + ", произведен в стране:  " + getCountry() +
                ", коробка передач: " + getTransmission() + ", тип кузова: " + getBodyType() +
                ", регистрационный номер: " + getRegistrationNumber() +
                ", количество мест: " + getNumberSeats() +
                ", шины:" + (rubber ? " зимняя" : " летняя") + " резина, " + (key.isRemoteEngineStart() ? " удаленный запуск двигателя" : " не удаленный запуск двигателя") + ", " + (key.isKeylessAccess() ? " безключевой доступ " : " клуючевой доступ "));
    }


    }



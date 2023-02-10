package transport;

public class Car extends Transport {
   private double engineVolume;
   private String transmission;
    private final String bodyType;
   private double registrationNumber;
    private final int numberSeats;
  private   boolean rubber;
  private Key key;

    public Car(String brand, String model, double engineVolume, String color, int year, String country,int maxSpeed, String transmission, String bodyType,
               double registrationNumber, int numberSeats, boolean rubber, Key key) {

        super(brand,model,year,country,color,maxSpeed);

        this.engineVolume = engineVolume;
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
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

    @Override
    public String toString() {
        return super.toString()+
                "Car{" +
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", numberSeats=" + numberSeats +
                ", rubber=" + (rubber ? "летняя": "зимняя"
                + key);
    }



    }



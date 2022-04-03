public class Car {
    public enum CAR_TYPE {
        PERSONAL,
        Truck,
        Van,
    }

    private final String producer;
    private final String model;      // står "name" i output sample, men bruker model istede.
    private final CAR_TYPE carType;
    private final int productionYear;
    private final int milage;
    private final String milageDate;
    private final int owner;

    public Car(String producer, String model, CAR_TYPE carType, int productionYear, int mileage,
               String milageDate, Person owner) {
        this.producer = producer;
        this.model = model;
        this.carType = carType;
        this.productionYear = productionYear;
        this.milage = mileage;
        this.milageDate = milageDate;
        this.owner = owner.getId();
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public CAR_TYPE getCarType() {
        return carType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getMileage() {
        return milage;
    }

    public String getMileageDate() {
        return milageDate;
    }

    public int getOwner() {
        return owner;
    }

    public void show() {
        System.out.println("\t\tProducer: " + getProducer());
        System.out.println("\t\tModel: " + getModel());
        System.out.println("\t\tType: " + getCarType());
        System.out.println("\t\tProduction Year: " + getProductionYear());
        System.out.println("\t\tMileage: " + getMileage());
        System.out.println("\t\tMileage Date: " + getMileageDate());
        System.out.println();
    }

    public static class Personal extends Car {
        public Personal(String producer, String model, int productionYear, int mileage, String mileageDate, Person owner) {
            super(producer, model, CAR_TYPE.PERSONAL, productionYear, mileage, mileageDate, owner);
        }
    }
    public static class Truck extends Car {
        public Truck(String producer, String model, int productionYear, int mileage, String mileageDate, Person owner) {
            super(producer, model, CAR_TYPE.Truck, productionYear, mileage, mileageDate, owner);
        }
    }
    public static class Van extends Car {
        public Van(String producer, String model, int productionYear, int mileage, String mileageDate, Person owner) {
            super(producer, model, CAR_TYPE.Van, productionYear, mileage, mileageDate, owner);
        }
    }
}

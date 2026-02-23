public abstract class Car {
    private final String vinNumber;
    private final String make;
    private final String model;
    private int mileage;

    protected Car(String vinNumber, String make, String model, int mileage) {
        if (vinNumber == null || vinNumber.isBlank()) throw new IllegalArgumentException("vinNumber is required");
        if (make == null || make.isBlank()) throw new IllegalArgumentException("make is required");
        if (model == null || model.isBlank()) throw new IllegalArgumentException("model is required");
        if (mileage < 0) throw new IllegalArgumentException("mileage cannot be negative");

        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getVinNumber() { return vinNumber; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getMileage() { return mileage; }

    public void setMileage(int mileage) {
        if (mileage < 0) throw new IllegalArgumentException("mileage cannot be negative");
        this.mileage = mileage;
    }

    public String getInfo() {
        return String.format("VIN: %s | Make: %s | Model: %s | Mileage: %d",
                vinNumber, make, model, mileage);
    }
}


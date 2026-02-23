public final class Truck extends Car {
    private final double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        if (towingCapacity < 0) throw new IllegalArgumentException("towingCapacity cannot be negative");
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" | Towing Capacity: %.1f", towingCapacity);
    }
}


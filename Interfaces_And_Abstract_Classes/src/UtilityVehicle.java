public final class UtilityVehicle extends Car {
    private final boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" | 4WD: %s", fourWheelDrive);
    }
}
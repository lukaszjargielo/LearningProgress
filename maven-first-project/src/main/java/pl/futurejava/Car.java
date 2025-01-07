package pl.futurejava;

public class Car {
    private String make;
    private int doorNumber;
    private boolean is4x4;
    private double fuelConsumptionPer100km;

    public Car() {
    }

    public Car(String make, int doorNumber, boolean is4x4, double fuelConsumptionPer100km) {
        this.make = make;
        this.doorNumber = doorNumber;
        this.is4x4 = is4x4;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public boolean isIs4x4() {
        return is4x4;
    }

    public void setIs4x4(boolean is4x4) {
        this.is4x4 = is4x4;
    }

    public double getFuelConsumptionPer100km() {
        return fuelConsumptionPer100km;
    }

    public void setFuelConsumptionPer100km(double fuelConsumptionPer100km) {
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
    }
}

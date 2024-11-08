package pl.futurejavacode.Car;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private String color;
    private int mileage;
    private final int maxSpeed;
    private int maxRange;
    private int actualRange;

    public Car(String make, String model, int year, String color, int maxSpeed, int maxRange) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.maxRange = maxRange;
        addFuel();
    }

    public Car(String make, String model, String color, int maxSpeed, int maxRange) {
        this(make, model, 2023, color, maxSpeed, maxRange);
        addFuel();

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public int getActualRange() {
        return actualRange;
    }

    public void setActualRange(int actualRange) {
        this.actualRange = actualRange;
    }

    public void drive (int distace) {
        mileage += distace;
        actualRange -= distace;
    }

    public void addFuel() {
        actualRange = maxRange;
    }
}

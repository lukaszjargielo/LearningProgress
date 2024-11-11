package pl.futurejavacode.dustCleaners;

public abstract class DustCleaner implements Cleaner, Vaccum{
    public void chargeBattery() {
        System.out.println("Battery recharging.");
    }

    public abstract void displayBrand();

}

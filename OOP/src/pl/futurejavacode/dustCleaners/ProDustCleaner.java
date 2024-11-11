package pl.futurejavacode.dustCleaners;

public class ProDustCleaner extends DustCleaner{
    public void cleanDust() {
        System.out.println("I am dusting.");
    }

    @Override
    public void displayBrand() {
        System.out.println("Pro");
    }

    @Override
    public void turnLightOn() {

    }

    @Override
    public void changeSuctionForce() {

    }
}

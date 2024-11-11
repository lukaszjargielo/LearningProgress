package pl.futurejavacode.dustCleaners;

public class Main {
    public static void main(String[] args) {
        ProDustCleaner proDustCleaner = new ProDustCleaner();
        TurboMaxDustCleaner turboMaxDustCleaner = new TurboMaxDustCleaner();
        TurboMax2000DustCleaner turboMax2000DustCleaner = new TurboMax2000DustCleaner();

        proDustCleaner.chargeBattery();
        turboMaxDustCleaner.chargeBattery();

        proDustCleaner.displayBrand();
        turboMaxDustCleaner.displayBrand();
        turboMax2000DustCleaner.displayBrand();
    }
}

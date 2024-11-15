package pl.futurejavacode.usbdevice;

public record Mouse(String name) implements USBDevice {

    @Override
    public boolean connect() {
        System.out.println("Mouse connected.");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Mouse disconnected.");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}

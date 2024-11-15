package pl.futurejavacode;

import pl.futurejavacode.drive.Drive;
import pl.futurejavacode.file.File;
import pl.futurejavacode.usbdevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Drive {
    List<USBDevice> usbDevices = new ArrayList<>();
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;


    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

    public void addUSBDevice(USBDevice usbDevice) {
        boolean isConnected = usbDevice.connect();
        if (isConnected) {
            usbDevices.add(usbDevice);
        }
    }

    public void removeUSBDevice(USBDevice usbDevice) {
        boolean isDisconnected = usbDevice.disconnect();
        if (!isDisconnected) {
            System.out.println("USB device forcefully disconnected.");
        }
        usbDevices.remove(usbDevice);
    }

    public void addFile(File file) {
        drive.addFile(file);
    }

    public void listFiles() {
        drive.listFiles();
    }

    public File findFile(String fileName) {
        return drive.findFile(fileName);
    }
}

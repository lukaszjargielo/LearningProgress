package pl.futurejavacode;

import pl.futurejavacode.drive.Drive;
import pl.futurejavacode.drive.HDDDrive;
import pl.futurejavacode.drive.SSDDrive;
import pl.futurejavacode.file.File;
import pl.futurejavacode.file.image.GIFImageFile;
import pl.futurejavacode.file.image.JPGImageFile;
import pl.futurejavacode.file.music.MP3File;
import pl.futurejavacode.usbdevice.MemoryStick;
import pl.futurejavacode.usbdevice.Mouse;
import pl.futurejavacode.usbdevice.USBDevice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Dell");
        Drive hddDrive = new HDDDrive();

        Computer computer = new Computer(monitor, hddDrive);
        hddDrive.addFile(new JPGImageFile("file.png", 400, 80));
        hddDrive.listFiles();
        computer.addFile(new GIFImageFile("Hotdog.gif", 200));
        computer.listFiles();

        Mouse mouse = new Mouse("Mouse");
        MemoryStick memoryStick = new MemoryStick("Pen drive");

        computer.addUSBDevice(mouse);
        computer.addUSBDevice(memoryStick);

        List<USBDevice> usbDevices = computer.getUsbDevices();

        for (USBDevice device : usbDevices) {
            System.out.println(device.getName());
        }

        computer.removeUSBDevice(mouse);
//        memoryStick.eject();
        computer.removeUSBDevice(memoryStick);

        MP3File mp3File = new MP3File("audio.mp3", 4000, "Rammstein", "Sonne", 100);

        GIFImageFile gifImageFile = new GIFImageFile("funnydog.gif", 150);

        JPGImageFile jpgImageFile = new JPGImageFile("holidays.jpg", 400, 80);

        Monitor monitor2 = new Monitor("Dell");
        Drive ssdDrive = new SSDDrive();

        Computer computer2 = new Computer(monitor2, ssdDrive);
        computer2.addFile(mp3File);
        computer2.addFile(gifImageFile);
        computer2.addFile(jpgImageFile);

        computer2.listFiles();
        File file = computer2.findFile("audio.mp3");
        System.out.println(file.getName());
        System.out.println(file);


        Drive hddDrive2 = new HDDDrive();
        computer2.setDrive(hddDrive2);

        computer2.addFile(mp3File);
        computer2.addFile(gifImageFile);
        computer2.addFile(jpgImageFile);

        computer2.listFiles();
        File file1 = computer2.findFile("funnydog.gif");
        System.out.println(file1.getSize());
        System.out.println(file1.getType());

    }
}

package org.example;

public class Mouse implements USBDevice, Powerable{
    @Override
    public void connect() {
        System.out.println("Mouse connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("Mouse disconnected.");
    }

    @Override
    public String getName() {
        return "This is a mouse.";
    }

     @Override
    public String getVersion() {
        return USBDevice.super.getVersion();
    }

    @Override
    public void powerOn() {
        System.out.println("I am turning on the power.");
    }

    @Override
    public void powerOff() {
        System.out.println("I am turning off the power.");
    }
}

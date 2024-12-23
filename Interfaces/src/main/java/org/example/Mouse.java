package org.example;

public class Mouse implements USBDevice{
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
}

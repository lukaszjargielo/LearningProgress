package org.example;

public class Keyboard implements USBDevice, Powerable{
    @Override
    public void connect() {
        System.out.println("Keyboard connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("Keyboard disconnected.");
    }

    @Override
    public String getName() {
        return "This is a keyboard.";
    }

    @Override
    public void powerOn() {
        System.out.println("I am turning on the power.");
    }

    @Override
    public void powerOff() {
        System.out.println("I am turning off the power.");
    }

    @Override
    public String getVersion() {
        return Powerable.super.getVersion();
    }
}

package org.example;

public class Keyboard implements USBDevice{
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
}

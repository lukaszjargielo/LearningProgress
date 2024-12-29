package org.example;

public class Computer {
    private Drive drive;

    public Computer(Drive drive) {
        this.drive = drive;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }
}

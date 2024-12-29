package org.example;

public class Drive {
    private String name;
    private final int sizeInTerabytes;

    public Drive(String name, int sizeInTerabytes) {
        this.name = name;
        this.sizeInTerabytes = sizeInTerabytes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeInTerabytes() {
        return sizeInTerabytes;
    }
}

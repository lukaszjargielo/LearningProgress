package org.example;

public interface USBDevice {
    static String VERSION = "3.0";

    static String getUSBVersion() {
        return "Version " + VERSION;
    }

    void connect();

    void disconnect();

    String getName();

    default String getVersion() {
        return "Default version";
    }
}

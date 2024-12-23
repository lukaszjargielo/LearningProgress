package org.example;

public interface USBDevice {
    void connect();

    void disconnect();

    String getName();

    default String getVersion() {
        return "Default version";
    }
}

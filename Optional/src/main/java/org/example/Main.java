package org.example;

public class Main {
    public static void main(String[] args) {

        Drive drive = new Drive("SSD", 1);
        Computer computer = new Computer(drive);

        System.out.println(computer.getDrive().getName());

        Drive drive2 = new Drive(null, 2);
        Computer computer2 = new Computer(drive2);

//        System.out.println(computer2.getDrive().getName().toUpperCase());

        if (computer2.getDrive() != null) {
            if (computer2.getDrive().getName() != null) {
                System.out.println(computer2.getDrive().getName().toUpperCase());
            }
        }
    }
}
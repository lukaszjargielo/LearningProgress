package org.example;

public class Main {
    public static void main(String[] args) {

        Drive drive = new Drive("ssd", 1);
        Computer computer = new Computer(drive);

        Drive drive2 = new Drive(null, 2);
        Computer computer2 = new Computer(drive2);

        if(computer.getDrive().isPresent()) {
            Drive drive1 = computer.getDrive().get();

            if (drive1.getName().isPresent()) {
                String name = drive1.getName().get();
                System.out.println(name.toUpperCase());
            }
        }

        if (computer2.getDrive().isPresent()) {
            Drive drive1 = computer2.getDrive().get();

            if(drive1.getName().isPresent()) {
                String name = drive1.getName().get();
                System.out.println(name);
            }
        }

        String name = computer.getDrive()
                .flatMap(Drive::getName)
                .orElse("Default drive");

        System.out.println(name);

        String name2 = computer2.getDrive()
                .flatMap(Drive::getName)
                .orElse("Default drive");
        System.out.println(name2);

//        computer2.getDrive()
//                .flatMap(Drive::getName)
//                .orElseThrow(() -> new RuntimeException("Something contains null"));

        String returnedString = computer2.getDrive()
                .flatMap(Drive::getName)
                .orElse(getDefault());

        System.out.println(returnedString);

        String returnedString2 = computer.getDrive()
                .flatMap(Drive::getName)
                .orElseGet(() -> getDefault());

        System.out.println(returnedString2);
    }

    private static String getDefault() {
        System.out.println("This text will always appear.");
        return "Anything";
    }

}
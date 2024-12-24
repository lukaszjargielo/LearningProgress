package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kamil");

        user.greet(new Greeter() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        });

        user.greet(new Greeter() {
            @Override
            public void greet(String name) {
                System.out.println("Hi " + name);
            }
        });

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t3");
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
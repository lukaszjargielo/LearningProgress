package org.example;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();

        user1.name = "£ukasz";
        user1.age = 36;
        user1.isActive = true;

        user2.name = "Natalia";
        user2.age = 35;
        user2.isActive = false;

        System.out.println(user1);
        System.out.println(user2);

        System.out.println(user1.name);
        System.out.println(user1.age);
        System.out.println(user1.isActive);
        user1.hello();

        
    }
}
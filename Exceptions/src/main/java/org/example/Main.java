package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        NamesReader namesReader = new NamesReader("src/main/resources/text.txt");
//        namesReader.printAllNames();

//        NamesReader2 namesReader2 = new NamesReader2("src/main/resources/text2.txt");
//        try {
//            namesReader2.readNames();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            {
                int a = 4;
                int b = 2;
//                int b = 0;
                System.out.println(a / b);
                System.out.println("Code after first block with possible ArithmeticException");
            }
            {
                List<String> names = new ArrayList<>();
                names.add("Lucas");
                System.out.println(names.get(0));
//                System.out.println(names.get(1));
                System.out.println("Code after second block with possible IndexOutOfBoundsException");
            }
            {
//                String name = "Lucas";
                String name = null;
                System.out.println(name.toLowerCase());
                System.out.println("Code after third block with possible NullPointerException");
            }
//        }catch (RuntimeException e) {
//            System.out.println("RuntimeException");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
//        }catch (RuntimeException e) {
//            System.out.println("RuntimeException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }


    }
}
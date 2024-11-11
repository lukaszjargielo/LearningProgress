package pl.futurejavacode.oopExercises;

public class StringConcatenator {
    private StringConcatenator() {}

    public static String concatenate(String s1, String s2) {
        return s1 + s2;
    }

    public static String concatenate(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }

    public static String concatenate(int numberOfStrings, String s) {
        String start = "";
        for (int i = 0; i < numberOfStrings; i++) {
            start += s;
        }
        return start;
    }

    public static String concatenate(String s1, String... strings) {
       String s = "";
        for (String string : strings) {
            s += string;
        }
        return s;
    }

    public static String concatenate(String[] stringsArray) {
        String s = "";
        for (String st: stringsArray) {
            s += st;
        }
        return s;
    }



}

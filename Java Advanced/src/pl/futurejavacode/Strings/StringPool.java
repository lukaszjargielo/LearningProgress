package pl.futurejavacode.Strings;

public class StringPool {
    public static void main(String[] args) {

        String s1 = "£ukasz";
        String s2 = "£ukasz";
        String s3 = new String("£ukasz");
        String s4 = s3;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println();

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println();

        System.out.println(s1 == s4);
        String internedString = s4.intern();
        System.out.println(s1 == s4);
        System.out.println(s1 == internedString);

    }
}
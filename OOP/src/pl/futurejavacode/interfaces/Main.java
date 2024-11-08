package pl.futurejavacode.interfaces;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        LengthPasswordValidator validator = new LengthPasswordValidator();
        SpecialCharactersPasswordValidator validator2 = new SpecialCharactersPasswordValidator();
        user.setPassword("security", validator);
        user.setPassword("security", validator2);
    }
}

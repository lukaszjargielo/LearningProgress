package pl.futurejavacode.interfaces;

public class LengthPasswordValidator implements PasswordValidator {
    @Override
    public boolean validate(String password) {
        if (password.length() > 8) {
            System.out.println("The password is optimal in terms of the number of characters.");
            return true;
        } else {
            System.out.println("The password is too short!");
            return false;
        }
    }
}

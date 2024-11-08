package pl.futurejavacode.interfaces;

public class SpecialCharactersPasswordValidator implements PasswordValidator{
    @Override
    public boolean validate(String password) {
        if (password.contains("#") || password.contains("!")) {
            System.out.println("The password is optimal in terms of the content of special characters.");
            return true;
        } else {
            System.out.println("The password does not contain special characters.");
            return false;
        }
    }
}

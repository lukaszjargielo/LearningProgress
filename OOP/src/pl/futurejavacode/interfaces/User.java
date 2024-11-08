package pl.futurejavacode.interfaces;

public class User {
    public void setPassword(String password, PasswordValidator validator) {
        validator.validate(password);
    }
}

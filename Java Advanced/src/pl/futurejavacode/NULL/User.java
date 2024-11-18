package pl.futurejavacode.NULL;

public class User {
    private String name;
    private String lastName;
    private int age;
    private boolean isOfAge;

    public User() {}

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOfAge() {
        return isOfAge;
    }

    public void setOfAge(boolean ofAge) {
        isOfAge = ofAge;
    }
}

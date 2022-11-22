package Inheritance;

public class User extends Person {
    public double maas; //states

    public void foo(){  //behaviour

    }

    public User(String name) {
        super(name,90);
    }

    @Override
    public void methodInPersonA() {
        System.out.println("Override methodInPersonA");
    }
}

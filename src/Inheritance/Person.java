package Inheritance;

public class Person {
    public String name;
    public String surname;
    public int age;

//    public Person(String name) {
//        this.name = name;
//    }

    public Person(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public void methodInPerson(){
        System.out.println("methodInPerson");
    }

    public void methodInPersonA(){
        System.out.println("methodInPerson a");
    }


}

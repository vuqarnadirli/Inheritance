package Main;

import Inheritance.User;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        //Class.forName klasi yuklmemk ucundur.
        //Klas yuklenen zaman ilk ise dusen blok static blokdur.
//        Class.forName("ClassforName.User");
//        Class.forName("ClassforName.Test.ClassforName.Test");
//        new User();
//        new User(3);


        User user = new User("User");
        user.maas = 0;


        System.out.println(user.name);
        System.out.println(user.age);
        user.methodInPerson();
        user.methodInPersonA();

    }
}
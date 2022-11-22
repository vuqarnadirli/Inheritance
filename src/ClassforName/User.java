package ClassforName;

public class User {
    static {
        System.out.println("Static block!");
    }

    public static void foo(){
        System.out.println("Method foo");
    }

    {
        System.out.println("nonstatic block, instance block");  //her obyekt yaranan zaman cagrilan blockdur.
    }

    public User(){
        System.out.println("User");
    }

    public User(int a){
        System.out.println("User a");
    }
}

package Inheritance;

public class A extends B{
    public void methodInA(){
        this.methodInB();
        methodInA2();
    }
    public void methodInA2() {

    }

//    public void methodInB(){
////        super.methodInB();
//        System.out.println("A");
//    }
}

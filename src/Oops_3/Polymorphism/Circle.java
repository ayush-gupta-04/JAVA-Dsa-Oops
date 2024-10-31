package Oops_3.Polymorphism;

public class Circle extends Shapes{
    @Override
    void info(){
        System.out.println("inside circle;");
    }

//    @Override
//    void next(){
//        System.out.println("next method in circle");
//    }

    static void one(){
        System.out.println("one function in circle");
    }
}
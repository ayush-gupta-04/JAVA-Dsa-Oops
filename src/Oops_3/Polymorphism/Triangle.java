package Oops_3.Polymorphism;

public class Triangle extends  Shapes {
    @Override
    void info(){
        System.out.println("inside triangle");
    }

    static void one(){
        System.out.println("one fun. inside square");
    }
}
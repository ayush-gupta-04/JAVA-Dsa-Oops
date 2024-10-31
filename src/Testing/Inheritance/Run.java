package Testing.Inheritance;

import static Testing.Inheritance.GrandParent.info;

public class Run {
    public static void main(String[] args) {
        Child c = new Child();
        Child.info();
    }

    public static void fun (){
        Run.mes();
        System.out.println("having fun");
    }

    public static void mes(){
        System.out.println("its messy");
    }
}
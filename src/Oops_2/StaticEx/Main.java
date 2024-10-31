package Oops_2.StaticEx;
//since human class is in the current package so we dont need to import it.
import Oops_2.StaticEx.Human;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Ayush",2000000,21);
        Human h2 = new Human("Sunny",2000000,21);
        System.out.println(Human.population);
        //1. for static variable ... don't do anything via obj. name ...
        //   do anything via class name.
        //2. static variable can be accessed even if no obj. is created.
        //3. static variable are obj. independent.
        //4. we can create static var. and methods as well.

        Human hu = new Human("ayush",100000,20);
        fun();


        //can do this to create object of non-static class (which is under another class) from psvm
        h1.initNode();
    }

    static void fun(){
//        greet();  //you cant use this because this requires an obj of the class.
        //but the fun function does not depend on instance.

        //to resolve the problem
        //1. declare greet as static.
        //2. make obj of the class .. then use the non-static method inside static context.
        Main con = new Main();   //since greet is inside Main class;
        con.greet();

        //imp --> we can access any method of a class by -->
        //        first make an obj of that class
        //        then use the method via the ref. var (or obj);
    }

    void greet(){
        //we can use static method from a non static method;
        fun();
        System.out.println("hello");
    }

}
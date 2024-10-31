package Oops_5.Abstract;


//if a class contains one or more than one abstract methods
//then class should also be declared as abstract.

//YOU CANNOT CREATE OBJECTS OF AN ABSTRACT CLASS.


import Oops_5.Interface.Engine;

// WE CANNOT CREATE A FINAL ABSTRACT CLASS ... since final prevents it from being inherited.
// A static method cannot be abstract ... since it cannot be overridden
public abstract class Parent {
    String name;

    //we cannot create obj of a superclass of abstract type .... but it can have constructor.
    //    and the constructor cannot be called directly ... it can be called through sub-class.
    Parent(){
        System.out.println("constructor of parent class");
    }

    //every abstract methods needs to be overriden in the child class.
    abstract void career(String name);
    abstract void partner(String name, int age);



//    abstract static void message(){
//        System.out.println("a static method cannot be abstract ... since it cannot be overriden");
//    }


    static void message(){
        //since there is no obj of an abstract class ....
        //we can have static methods.
        System.out.println("hello");
    }
    public void mes(String srt){
        System.out.println(srt);
    }
}

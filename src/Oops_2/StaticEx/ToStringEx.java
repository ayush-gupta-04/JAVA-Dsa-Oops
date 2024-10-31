package Oops_2.StaticEx;

public class ToStringEx {
    //we cannot use People class inside psvm...
    //to use class people we will first require
    //to build an obj. of toStringEx class;

    //because People class is dependent on toStringEx class;
    //if class People was outside toStringEx class then we will not have to use static
    //   to use class People.
     class People{
        String name;

        public People(String name) {
            this.name = name;
        }
    }


    static class Indian{
        String name;

        public Indian(String name) {
            this.name = name;
        }
    }


    static class Human{
        String name;

        public Human(String name) {
            this.name = name;
        }


        //the sout function will look for toString method here first.
        @Override
        public String toString() {
            return this.name;
        }
    }



    public static void main(String[] args) {
        //this will throw an error .... since using a non-static class inside static context.
//        People p1 = new People("Ayush");
//        People p2 = new People("gupta");
//
        //this will work since we declared indian class as static.
        Indian i1 = new Indian("Ayush");
        Indian i2 = new Indian("Gupta");

        //to print obj. of any class
        //it will look to toString method in the class;
        //if not available then it will print some default values.
        System.out.println(i1);    //it will give (  Oops_2.staticEx.toStringEx$Indian@5f184fc6  );
        //since it does not have a toString method.



        Human h1 = new Human("Ayush");
        Human h2 = new Human("Gupta");
        //now it will print "Ayush" as toString method is defined in the class GrandParent.
        System.out.println(h1);


    }
}
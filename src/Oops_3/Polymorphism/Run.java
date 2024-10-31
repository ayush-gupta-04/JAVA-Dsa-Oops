package Oops_3.Polymorphism;

public class Run {

    public static void main(String[] args) {
        Shapes s = new Shapes();
        Square sq = new Square();
        Circle c = new Circle();
        Triangle t = new Triangle();
        Shapes obj = new Circle();

        //the ref. var will decide which method to access..
        //and at runtime the obj type will decide which method to run.
        //hence below ... info of circle will run.
        //this is called overriding....or runtime polymorphism.
        //overriding --> if a method is overridden it means that it will run
        //               rather than the same method above it in parent class.
        obj.info();



        //niche wala to inheritance hi h na ... upto line 35


        //if the method is not present in the child class ...
        //it will look for the method in the parent class;
        c.next();
        //next method is not in circle .. hence
        //it will look above it until it finds it in the above parent class;


        //EquiTriangle has no info --> triangle has no info
        //hence it will look above in Shapes for info.
        EquiTriangle eq = new EquiTriangle();
        eq.info();




        Shapes s1 = new Shapes();
        Circle c1 = new Circle();
        Shapes s2 = new Circle();

        //basic of static ... that we use class name to call a static method
        Shapes.one();
        Circle.one();

        //static methods cannot be overridden..
        //override depends on objects ... static does not depend on objects
        //         hence static methods cannot be overridden.
        //it will print the one in the parent class;
        s2.one();





    }

    //" final " keyword --> is used for a class
    //                      1. all the inside method will become final.
    //                      2. it cannot make child class.
    //
    //                  --> is used for a method
    //                      1. it cannot be overriden.
}
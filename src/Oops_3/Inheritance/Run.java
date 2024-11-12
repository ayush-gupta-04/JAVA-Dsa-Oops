package Oops_3.Inheritance;


//parent class --> Box
//child class --> BoxWeight
//by ref. var of child class --> we can access --> 1. variables of parent class;
//                                                 2. variables of it's own class;

//by ref. var of parent class --> we can only access variables of it's own class;
public class Run {

    public static void main(String[] args) {
        //b1,b2,b3 cannot access wieght.
//        Box b1 = new Box();
//        System.out.println(b1.l + "  " + b1.h + "  " + b1.w);
//
//        Box b2 = new Box(4);
//        System.out.println(b2.l + "  " + b2.h + "  " + b2.w);
//
//        Box b3 = new Box(3,4,5);
//        System.out.println(b3.l + "  " + b3.h + "  " + b3.w);


        //bw1 can access all variables of its own as well as of its parent.
        BoxWeight bw1 = new BoxWeight(1,2,3,20);
        System.out.println(bw1.l + "  " + bw1.h + "  " + bw1.w + "  " + bw1.weight);

        //ref.var --> parent ..... obj --> child
        Box b4 = new BoxWeight(5,6,7,10);
//        b4.greet();
        //since ref. var is of parent type so we can only
        //      access the variables which are in parent class;
        //ref. var will determine which var we can access.
//        System.out.println(b4.h + "  " + b4.l + "  " + b4.w);



        //ref. var --> child ..... obj --> parent
//        BoxWeight bw2 = new Box(1,2,3);
        //ref var is of type BoxWeight so we should access to weight...
        //but to access weight first it must be initialised.
        //hence its giving me an error.

    }
}
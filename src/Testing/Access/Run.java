package Testing.Access;

import Testing.Access.A.BottleCapacity;

public class Run {
    public static void main(String[] args) {
        //l is private.
        Bottle b = new Bottle(3,4,5);
        b.info();
        int length = b.getL();
        System.out.println(length);
        //l is private

        //PriceOfBottel  method is private + static
        b.getPrice();
        //PriceOfBottel  method is private + static



        //h is not modified....sub-class same package + access from same package.
        BottleColor bc = new BottleColor(4,5,6,"red");
        int height = bc.h;
        System.out.println("height of bottle is " + height + " . . . calling from sub-class ");

        //w is protected .... sub-class same package + access form same package.
        int width = bc.w;
        System.out.println("width of bottle is " + width + " . . . calling from sub-class ");

        BottleCapacity bcc1 = new BottleCapacity(2,3,4,8);











    }
}

package Oops_3.Inheritance;

public class BoxWeight extends Box{
    int weight;

    public BoxWeight( int l, int w, int h,int weight) {
        super(l,w,h);
        //While initialising BoxWeight, this BoxWeight constructor
        //      automatically calls the default constructor of the parent class.

        //used to call the constructor of the parent class;
        //used to initialise the values present in the parent class;
        //if we call the super method then it will initialise the variable of parents for this child.
        //that's y we need to call the constructor of the parent class;
//        System.out.println(super.h);    super refer to class directly above it.
        this.weight = weight;
    }

    @Override
    public void greet(){
        System.out.println("box weight");
    }

    //super class means --> class directly above it.
    //works as "this" keyword but to refer to class directly above it.


}
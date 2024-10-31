package Oops_3.Inheritance;

public class BoxWeight extends Box{
    int weight;

    public BoxWeight(int l, int h, int w, int weight) {
        super(l, h, w);
        //used to call the constructor of the parent class;
        //used to initialise the values present in the parent class;
//        System.out.println(super.h);    super refer to class directly above it
        this.weight = weight;
    }

    @Override
    public void greet(){
        System.out.println("box weight");
    }

    //super class means --> class directly above it.
    //works as "this" keyword but to refer to class directly above it.


}
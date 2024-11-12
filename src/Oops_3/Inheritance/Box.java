package Oops_3.Inheritance;

public class Box {
    int l ;
    int h;
    int w;


    Box(){
        this.l = -2;
        this.h = -2;
        this.w = -4;
    }


    Box(int l, int h, int w){
        this.l = l;
        this.h = h;
        this.w = w;
    }


    Box(int side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public void greet(){
        System.out.println("box");
    }


}
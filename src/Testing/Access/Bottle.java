package Testing.Access;

public class Bottle {
    private int l;
    int h;
    protected int w;
    static int price = 60;

    public Bottle(int l, int w, int h) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Bottle(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    public void info(){
        System.out.println("the dimentions are " + this.l + "x" + this.w + "x" + this.h);
    }

    //getter for l;


    public int getL() {
        return l;
    }

    private static void PriceOfBottle(){
        System.out.println("Price of bottle is " + Bottle.price);
    }

    public void getPrice(){
        PriceOfBottle();
    }

}

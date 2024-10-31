package Testing.Access;

public class BottleColor extends Bottle{
    String color;

    public BottleColor(int l, int w, int h, String color){
        super(l,w,h);
        this.color = color;
    }

    public void ColorOfBottle(){
        System.out.println("color of bottle is " + this.color);
    }
}

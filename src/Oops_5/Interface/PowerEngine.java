package Oops_5.Interface;

public class PowerEngine implements Engine{

    //start is overriding the start in parent .... so it should have better acces than the parent one
    @Override
    public void start() {
        System.out.println("starting power engine");

    }

    @Override
    public void stop() {
        System.out.println("stopping power engine");
    }

    @Override
    public void acc() {
        System.out.println("accelerating power engine");
    }
}

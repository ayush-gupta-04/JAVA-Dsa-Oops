package Oops_5.Interface;

public class Radio implements Media{
    @Override
    public void start() {
        System.out.println("start radio");
    }

    @Override
    public void stop() {
        System.out.println("stop radio");
    }
}

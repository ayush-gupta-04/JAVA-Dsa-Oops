package Oops_5.Interface;

public class MXplayer implements Media{
    @Override
    public void start() {
        System.out.println("start the MXplayer");
    }

    @Override
    public void stop() {
        System.out.println("stop the MXplayer");
    }
}

package Oops_5.Interface;

import com.sun.security.jgss.GSSUtil;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("starting the electric engine");
    }

    @Override
    public void stop() {
        System.out.println("stopping the electric engine");
    }

    @Override
    public void acc() {
        System.out.println("accelerate the electric engine");
    }
}

package Oops_5.Interface;

public class Car implements Engine,Brake,Media {

    @Override
    public void brake() {
        System.out.println("apply brake");
    }

    @Override
    public void start() {
        System.out.println("start the car");
    }

    @Override
    public void stop() {
        System.out.println("stop the car");
    }



    @Override
    public void acc() {
        System.out.println("accelerate the car");
    }
}

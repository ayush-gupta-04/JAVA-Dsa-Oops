package Oops_5.Interface;

public class DiscBrake implements Brake{
    @Override
    public void brake() {
        System.out.println("apply disc brake");
    }
    
}

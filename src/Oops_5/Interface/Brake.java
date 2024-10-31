package Oops_5.Interface;

public interface Brake {
    void brake();

    //since static methids cannot be overriden ... so it should have a body here;
    static void defaultBrake(){
        System.out.println("default brake is not available");
    }
}

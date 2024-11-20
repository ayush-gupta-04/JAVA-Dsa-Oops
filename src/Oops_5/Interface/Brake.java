package Oops_5.Interface;


//variable in interface -->
//  1. Final , public , static by default.

//methods in interface -->
//  1. Cannot be final. : since it cannot be overridden.
//  2. Public and Abstract by default;
//  3. Can be static. : if static then must be defined here itself.


public interface Brake {
    int a = 0;
    void brake();
    //since static methids cannot be overriden ... so it should have a body here;
    static void defaultBrake(){
        System.out.println("default brake is not available");
    }
}

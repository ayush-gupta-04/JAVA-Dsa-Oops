package Oops_5.Abstract;

public class Son extends Parent{


    public Son(String name){
        //calling the constructor of the super-class through the sub-class.
        super();
        this.name = name;
    }
    @Override
    void career(String name){
        System.out.println("i want to be a " + name + " --> from son");
    }

    @Override
    void partner(String name, int age){
        System.out.println("i will marry " + name + " of age " + age + " --> from son");
    }



}

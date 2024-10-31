package Oops_5.Abstract;

public class Daughter extends Parent{

    public Daughter(String name){
        this.name = name;
    }
    @Override
    void career(String name){
        System.out.println("i want to be a " + name + " --> from daughter");
    }

    @Override
    void partner(String name, int age){
        System.out.println("i will marry " + name + " of age" + age + "--> from daughter");
    }
}

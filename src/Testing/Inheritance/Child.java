package Testing.Inheritance;

public class Child extends Parent{

    String laptop;
    Child(){
        super();
        this.laptop = null;

    }

    public Child(String name, int age, int salary,String city,String car,String lap){
        super(name,age,salary,city,car);
        this.laptop = lap;
    }

    public static void info(){
        System.out.println("inside child class");
    }

}
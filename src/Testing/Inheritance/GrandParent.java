package Testing.Inheritance;

public class GrandParent {
    String name;
    int age;
    int salary;
    String city;

    public GrandParent(){
        this.name = null;
        this.age = -1;
        this.salary = -1;
    }

    public GrandParent(String name, int age, int salary,String city){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.city = city;

    }

    public static void info(){
        System.out.println("inside GrandParent");

    }

}
package Testing.Inheritance;

public class Parent extends GrandParent{
    String city;
    String car;
    public Parent(){
        super();

    }

    public Parent(String name, int age, int salary,String city,String car){
        super(name,age,salary,city);
        this.car = car;

    }


}
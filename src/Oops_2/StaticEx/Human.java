package Oops_2.StaticEx;
//static var --> property that is not directly related to the obj. but is
//               common to all the obj. is called the static variable or method.
//particular obj. independent.
public class Human {
    String name;
    int salary;
    int age;
    static int population;

    class Node{}

    public Human(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        //to access static variable we should use class name...not this.<static var>.
        Human.population += 1;
    }
    public void normal(){
        System.out.println("i am normal");
    }
    public void initNode(){
        Node node = new Node();
    }
}
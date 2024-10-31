package Oops_1;

public class First {

    public static void main(String[] args) {
        Student s1 = new Student();
        //by default constructor humesha rehta hi h...we don't need to make it
        //by default constructor assigned default value to s1.
        System.out.println(s1.name);
        System.out.println(s1.roll);
        Student s2 = new Student(10858,"Ayush",99.8f);
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.marks);
        //to access the methods of Student class we need
        // to ( <ref. var.>.method );
        s2.greeting();
        Student s3 = new Student(10869,"Adesh",99.9f);
        s3.greeting();
        s3.changeName("Adesh Dutta");
        s3.greeting();
        Student s4 = new Student(s3);
        System.out.println(s4.roll);
        System.out.println(s4.name);
        System.out.println(s4.marks);
        Student s5 = new Student();
        System.out.println(s3);


    }
}
//this keyword -->1. whenever you try to access any item
//                   in the class via its object....we use this keyword.
//                   "this" is replaced with the object reference variable;
//             -->2. is use to call the constructor of the same class.
//             -->3. is use to access the variable and methods of the same class
class Student{
    int roll;
    String name;
    float marks;
    void greeting(){
        System.out.println("hello " + name);
    }
    void changeName(String new_name){
        this.name = new_name;
    }
    Student(Student other){ //other is of what type?? --> it's of student.
        this.roll = other.roll;
        this.name = other.name;
        this.marks = 92.4f;
    }
    Student(){
        //it's how you can call a constructor from another constructor.
        //internally it's like --> Student(108,"Rahul",89.23f);
        this(108,"Rahul",89.23f);
    }
    //making a constructor to assign values to the object;
    //here this will be replaced by object reference variable.
    //you don't have to return anything in a constructor.
    Student(int roll, String n, float m){
        this.roll = roll;
        this.name = n;
        this.marks = m;
    }

}
package Oops_5.Abstract;

public class Run {
    public static void main(String[] args) {
        Son s1 = new Son("Ayush");
        s1.career("engineer");
        s1.partner("alia", 23);


        Daughter d1 = new Daughter("Alia");
        d1.career("doctor");
        d1.partner("kunal", 21);
    }
}

package Oops_2.Importing.B;

import static Oops_2.Importing.A.Message.message_2; //you can only access message_2();
import static Oops_2.Importing.A.Message.*;  //you can access any methods in Message class;

public class Import {
    public static void main(String[] args) {
        //1. we have imported the message_1 method from Message java file in package A;
        //2. to use a method in another package we should tag it as public...hence message_1 is public.
        message_1();
        message_2();

    }
}
package Oops_1;


//1. Final Variables: A final variable can only be initialized once, and its value cannot be changed later. It is often used to define constants.
//2. Final Methods: A final method cannot be overridden by subclasses.
//3. Final Classes: A final class cannot be subclassed or inherited.
//                  final does not imply immutability; an object’s state can still be changed, but its reference cannot be reassigned.
public class Wrapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        //it will not change the value of a and b.
        //since these are pass by value.

        System.out.println(a + "  " + b);
        Integer x = 10;
        Integer y = 20;
        //Integer wrapper class converts the value to an object
        //so many functions are available.
//        x.byteValue();
//        x.toString();   etc_etc
        swapi(x,y);
        //again it will not swap
        //since Integer class is final class.
        System.out.println(x + "  " + y);
        //'final' for primitives...it does not allow to change value of primitives only.
        //for objects it allows to change the value but it does not allow the ref var to point to another object.
        final int sum = 0;
        //now we can't change the value of sum.
//        sum = 2; will give an error;
        final int[] nums = new int[2];
        nums[0] = 2;
        System.out.println(nums[0]);
//        final Integer num = 3;
//        num = 5;
        //it's working for Integer object since it's already of final.
        final int[] arr = new int[3];
        arr[0] = 5;
        //above is ok
        //you cannot reassign the non primitives again which is of final.
//        arr = new int[4];
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swapi(Integer x, Integer y){
        Integer temp = x;
        x = y;
        y = temp;
    }
}
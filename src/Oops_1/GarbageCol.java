package Oops_1;

public class GarbageCol {
    public static void main(String[] args) {
        //java automatically delete the object when it is not pointed by any ref var.
        //garbage collection deletes it automatically.
        //we can't say when to remove and when not to.
        //but we can say if you are deleting the obj .. then do this or that.
        Book b1 = new Book();
        for(int i = 0; i < 1000000000 ; i++){
            //whenever b1 will point to the next obj it will get destroyed
            //it will not destroy if the load on the memory is low.
            b1 = new Book();
        }
    }
}
class Book{
    String name;
    Book(){
    }
    Book(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        //display this when the obj is being destroyed.
        System.out.println("obj is destroyed");
    }
}
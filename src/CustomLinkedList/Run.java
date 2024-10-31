package CustomLinkedList;

import java.util.LinkedList;

public class Run {
    public static void main(String[] args) {
//        LinkList list = new LinkList();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertLast(1);
//        list.insert(7, 2);
//        list.display();
//        int size = list.sizeOfList();
//        System.out.println(list.removeFirst());
//        list.display();
//        System.out.println(list.remove(2));
//        list.display();



        DoublyLinkList Dlist = new DoublyLinkList();
        Dlist.insertFirst(5);
        Dlist.insertFirst(6);
        Dlist.display();

        Dlist.insertLast(10);
        Dlist.display();

        Dlist.insert(1,1);
        Dlist.display();

        Dlist.insert(99,2);
        Dlist.display();

        Dlist.insert(105,6);
        Dlist.display();

        Dlist.removeFirst();
        Dlist.display();

        Dlist.remove(2);
        Dlist.display();





    }
}

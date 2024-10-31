package CustomLinkedList;

public class LinkList {

    private Node head;
    private Node tail;
    private int size;

    public LinkList(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            //you are inserting first item.
            tail = head;
        }
        size++;
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void insertLast(int value){
        Node node = new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }


    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i = 1 ; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }


    public int sizeOfList(){
        return this.size;
    }



    public int removeFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;

    }


    public int removeLast(){
        Node temp = head;
        for(int i = 0; i < size - 2; i++){
            temp = temp.next;
        }
        //now temp is pointing to 2nd last element;
        int value = tail.value;
        tail = temp;
        temp.next = null;
        size--;
        return value;
    }


    public int remove(int index){
        if(size == 1){
            removeFirst();
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        //now temp is pointing to the (i-1)th index.
        int value = temp.next.value;
        temp.next = temp.next.next;
        return value;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        public Node(int value){
            this.value = value;
        }
    }
}
package CustomLinkedList;

public class DoublyLinkList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkList(){
        this.size = 0;
    }


    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;

    }
    public void display(){
        if(size == 0){
            System.out.println("null");
            return;
        }
        Node node = head;
        System.out.print("null" + " --> ");
        int i = 1;
        while(node != null){
            System.out.print(node.value);
            if(i != size){
                System.out.print(" <--> ");
            }
            i++;node = node.next;
        }
        System.out.println(" --> " + "null");
    }
    public void insertLast(int value){
        Node node = new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }
    public void insert(int value,int index){
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        //we have reached at index - 1;
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index >= size){
            insertLast(value);
            return;
        }
        //creating the new node;
        Node node = new Node(value);
        //creating link between (node & index)
        node.next = temp.next;
        temp.next.prev = node;

        //creating link between (node & index-1)
        node.prev = temp;
        temp.next = node;
        size++;
    }
    public int removeFirst(){
        if(size == 0){
            return -1;
        }
        int value = head.value;
        if(size == 1){
            head = null;
            return value;
        }


        head = head.next;
        head.prev = null;
        size--;
        return value;
    }
    public int removeLast(){
        if(size == 1){
            return removeFirst();
        }
        if(size == 0){
            return -1;
        }
        int value = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return value;
    }
    public int remove(int index){
        if(index == 0){
            return removeFirst();
        }
        if(index >= size - 1){
            return removeLast();
        }
        Node temp = head;
        int value = temp.next.value;
        for(int i = 0; i < index - 1; i++){
            temp= temp.next;
        }
        temp.next = temp.next.next;
        temp.next.next.prev = temp;
        size--;
        return value;
    }

    private static class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

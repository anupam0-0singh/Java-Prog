package DSA.linkedList.doublyLinkedList;

public class customDLL {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    // public void insertLast(int value){

    //     if(tail == null){
    //         insertFirst(value);
    //         return;
    //     }
    //     Node node = new Node(value);
    //     node.next = null;
    //     tail.next = node;
    //     node.prev = tail;
    //     tail = node;
    // }

    public void display(){
        Node node = head;
        Node last = null;

        while(node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}   
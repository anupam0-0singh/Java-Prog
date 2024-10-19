package DSA.linkedList.doublyLinkedList;

public class main {
    public static void main(String[] args) {

        customDLL list = new customDLL();

        list.insertFirst(8);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(5);
        list.display();

        // list.insertLast(9);
        // list.insertLast(4);
        // list.insertLast(6);
        // list.insertLast(10);
        // list.display();
    }
}

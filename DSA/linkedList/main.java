package DSA.linkedList;

public class main {
    public static void main(String args[]){
        customLinkedList list = new customLinkedList();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(9);
        list.display();

        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(6);
        list.insertLast(8);
        list.display();

        list.insert(100, 4);
        list.display();

        list.deleteFirst();
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        list.delete(5);
        list.display();

        System.out.println(list.delete(2));
        list.display();

        // For commit purpose only
    }
}

package access;

public class main {
    public static void main(String args[]){
        A obj = new A(25, "Anupam");

        // Needed to do few things
        // 1. Access the data members
        // 2. Modify the data members

        // ArrayList<Integer> list = new ArrayList<>(25); 

        obj.getNum();

        objectDemo obj2 = new objectDemo(35);
        System.out.println(obj2.hashCode());
    }
}

package properties.inheritance;

public class main {
    public static void main(String[] args) {
        box box1 = new box(4.6, 7.9, 9.9);
        box box2 = new box(box1);
        System.out.println(box1.l + " " + box1.h + " " + box1.l);

        boxWeight box3 = new boxWeight();
        System.out.println(box3.l + " " + box3.h + " " + box3.l + " " + box3.weight);

        boxWeight box4 = new boxWeight(4.2, 6.5, 9.8, 15.5);
        System.out.println(box4.l + " " + box4.h + " " + box4.l + " " + box4.weight);

        boxPrice box5 = new boxPrice();
        System.out.println(box5.price);
    }
}

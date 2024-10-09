package cloning;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        human Kunal = new human(34, "Kunal");
        // human twin = new human(Kunal);

        human twin = (human)Kunal.clone();
        System.out.println(twin.name + " " + twin.age);
    }
}

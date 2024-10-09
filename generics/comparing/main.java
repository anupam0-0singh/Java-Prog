package generics.comparing;

public class main {
    public static void main(String[] args) {
        student Kunal = new student(12, 85.97f);
        student Rahul = new student(5, 97.25f);

        if(Kunal.compareTo(Rahul) < 0){-
            System.out.println("Rahul got more marks");
        }
    }
}

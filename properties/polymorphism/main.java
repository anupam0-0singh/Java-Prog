package properties.polymorphism;

public class main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle circle = new circle();
        square square = new square();

        shape.area();
        circle.area();
        square.area();
    }
}

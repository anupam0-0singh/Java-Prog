package properties.polymorphism;

public class numbers {

    int sum(int a , int b){
        return a + b;
    }

    int sum(int a , int b, int c){
        return a + b;
    }

    public static void main(String[] args) {
        numbers obj = new numbers();

        obj.sum(2, 3);
        obj.sum(2, 3, 4);
        
    }
}

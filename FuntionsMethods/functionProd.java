package FuntionsMethods;

import java.util.*;

public class functionProd {
    public static int Product(int a, int b){
        int Prod = a * b;
        return Prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int Prod = Product(a, b);
        System.out.println("Product of two numbers: " + Prod);
    }
}

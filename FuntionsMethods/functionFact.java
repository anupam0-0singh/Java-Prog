package FuntionsMethods;

import java.util.*;

public class functionFact {
    public static void Factorial(int n){

        if (n<0) {
            System.out.print("Invalid number!");
            return;
        }
        int fact = 1;
        for(int i = n; i>=1; i--){
            fact = fact * i;
        }
        System.out.print("Factorial: " + fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Factorial(n);
    }
}

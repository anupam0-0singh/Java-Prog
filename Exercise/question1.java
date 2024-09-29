package Exercise;

// Enter 3 numbers from the user and make a function to print their average.

import java.util.*;

public class question1 {
    public static int Average(int a, int b){
        int avg = (a + b) / 2;
        System.out.println("Average: " + avg);
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        Average(a, b);
    }
}

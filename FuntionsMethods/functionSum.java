package FuntionsMethods;

import java.util.*;

public class functionSum {
    public static int sumNum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = sumNum(a, b);
        System.out.print("Sum of two numbers: " + sum);
    }
}
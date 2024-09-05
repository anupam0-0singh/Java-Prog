package Exercise;

// Write a function which takes in two numbers and return greater of those two.

import java.util.*;

public class question3 {
    public static void greaterOfTwo(int a, int b){
        if (a>b) {
            System.out.println("Greater no.: " + a);
        }
        else{
            System.out.println("Greater no.: " + b);
        }
    return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        greaterOfTwo(a, b);
    }
}

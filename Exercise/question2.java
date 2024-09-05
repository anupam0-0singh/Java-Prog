package Exercise;

// Write a function to print the sum of all odd number from 1 to n.

import java.util.*;

public class question2 {
    public static void sumOdd(int n){
        int i, odd = 0;
        for(i = 1; i <= n; i++){
            if (i%2!=0) {
                odd = odd + i;
            }
        }
        System.out.println("Sum of odd number: " + odd);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        sumOdd(n);
    }
    
}

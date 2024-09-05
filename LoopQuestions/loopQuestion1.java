package LoopQuestions;
// Print the sum of first n natural numbers.

import java.util.*;

public class loopQuestion1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i, sum = 0;
        
        for(i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

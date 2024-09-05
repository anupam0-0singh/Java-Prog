package LoopQuestions;

// Print all even number till n.

import java.util.*;

public class qestion3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        int i;
        for (i=0; i<=a; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

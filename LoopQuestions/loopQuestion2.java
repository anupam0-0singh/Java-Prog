package LoopQuestions;
// Print the table of a number input by the user.

import java.util.*;

public class loopQuestion2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        int i, table;
        for(i=1;i<11;i++){
            table = a*i;
            System.out.println(table);
        }
        
    }
}

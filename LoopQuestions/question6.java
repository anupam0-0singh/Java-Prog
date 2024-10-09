package LoopQuestions;

import java.util.*;

public class question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count=0, i;

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(i=1;i<=n;i++){
            if (n%i==0) {
                count++;
            }
        }
        
        if (count==2) {
            System.out.println( "Given is Prime");
        }
        else{
            System.out.println("Given number is not Prime");
        }
    }
}

package Exercise;

import java.util.*;

// Write a function that takes in age as input and return if that person is eligible to vote or not. 
// A person of age > 18 is eligible to vote. 

public class question5 {
    public static void voteAge(int p){
        if (p >= 18) {
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int p = sc.nextInt();

        voteAge(p);
    }
    
}

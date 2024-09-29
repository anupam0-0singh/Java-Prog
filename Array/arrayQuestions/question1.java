package Array.arrayQuestions;

// Take an array of names as input from the user and print them on the screen.

import java.util.*;

public class question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        String name[] = new String[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter the names: ");
            name[i] = sc.next();
        }

        for(int i = 0; i < size; i++){
            System.out.println("Names: "  + name[i]);
        }
        
    }
}

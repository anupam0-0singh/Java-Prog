package Array.arrayQuestions;

// Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.*;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i = 0; i <= arr.length-1; i++){
            if (arr[i]>i+1) {
                isAscending = false;
            }
        }
        if (isAscending==true) {
            System.out.println("It is in ascending order.");
        }
        if (isAscending==false) {
            System.out.println("It is not in ascending order.");
        }
        
    }
}

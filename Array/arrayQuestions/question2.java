package Array.arrayQuestions;

// Find the maximum and minimum number in an array of integers.

import java.util.*;

public class question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for(int i = 0; i < size; i++){
            System.out.println("Enter the elements: ");
            arr[i] = sc.nextInt(); 
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if (arr[i]<min) {
                min = arr[i];
            }
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

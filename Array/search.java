package Array;
import java.util.*;

// Take an array as input from the user. Search for a given number x and print the index at which it occurs.

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the size of the array: ");
        int size = sc.nextInt();
        int inp[] = new int[size];

        // Taking input of size
        for(int i = 0; i < size; i++){
            System.out.print("Provide the values in array: ");
            inp[i] = sc.nextInt();
        }

        // Taking input of which value we need to find
        System.out.print("What you want to find: ");
        int x = sc.nextInt();

        // Finding x and giving output
        for(int i = 0; i < inp.length; i++){
            if (inp[i] == x) {
                System.out.println("X is found at index: " + i);
            }
        }
    }
}

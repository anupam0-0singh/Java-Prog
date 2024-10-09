package Array;
import java.util.*;

public class userInput {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
    
        int marks[] = new int[size];
    
        // For Input
        for(int i = 0; i < size; i++){
            marks[i] = sc.nextInt();
        }

        // For Output
        for(int i = 0; i < size; i++){
            System.out.println(marks[i]);
        }
    }
}

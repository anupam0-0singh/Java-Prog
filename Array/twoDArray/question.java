package Array.twoDArray;

// Take a matrix as input from the user. Search for a given number x and
// print the indices at which it occurs.

import java.util.*;

public class question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the number you want to find: ");
        int x = sc.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j]==x){
                    System.out.println(i + "," + j);
                }
            }
        }
    }
}

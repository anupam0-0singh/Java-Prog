import java.util.*;

public class conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    //     int age = sc.nextInt();
    //     if (age > 18 ){
    //         System.out.println("Adult");
    //     }
    //     else{
    //         System.out.println("Under age");
    //     }

        // int num = sc.nextInt();
        // if(num%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a==b) {
        //     System.out.println("Equal");
        // }
        // else if (a>b) {
        //     System.out.println("A is greater");
        // }
        // else{
        //     System.out.println("A is lesser");
        // }

        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("Red");
            break;
            case 2: System.out.println("Blue");
            break;
            case 3: System.out.println("Green");
            break;
            default: System.out.println("Invalid button");
        }

    }
    
}

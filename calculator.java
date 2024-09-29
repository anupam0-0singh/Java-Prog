import java.util.*;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b, result;
        char sym;

        System.out.println("Enter 1st number: ");
        a = sc.nextInt();

        System.out.println("Select the operator: +, -, *, /");
        sym = sc.next().charAt(0);

        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();

        if (sym == '+') {
            result = a + b;
            System.out.println("Result: " + result);
        }
        else if (sym == '-') {
            result = a - b;
            System.out.println("Result: " + result);
        }
        else if (sym == '*') {
            result = a * b;
            System.out.println("Result: " + result);
        }
        else if (sym == '/') {
            if (b != 0) {
                result = a / b;
                System.out.println("Result: " + result);
            }
            else{
                System.out.println("Numerator cannot be zero.");
            }
            
        }
        else{
            System.out.println("Error! Invalid Operator.");
        }

    }
    
}

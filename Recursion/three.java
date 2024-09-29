package Recursion;

// Calculate factorial

public class three {
    public static int calcFact(int n){
        if (n == 1 || n ==0) {
            return 1;
        }

        int f1 = calcFact(n-1);
        int f2 = n * f1;
        return f2;
    }
    public static void main(String[] args){
        int n = 5;
        int ans = calcFact(n);
        System.out.println(ans
        );
    }
}

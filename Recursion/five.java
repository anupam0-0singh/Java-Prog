package Recursion;

// Caluclate x^n;

public class five {
    public static int calcPow(int x, int n){
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int calF1 = calcPow(x, n-1);
        int calF2 = x * calF1;
        return calF2;
    }
    public static void main(String[] args){
        int x=2, n=5;
        int ans = calcPow(x, n);
        System.out.println(ans);
    }
}

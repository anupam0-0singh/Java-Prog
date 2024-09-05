package FuntionsMethods;

import java.util.*;

public class Functions {
    public static void printName(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printName(name);
    }
}

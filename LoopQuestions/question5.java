package LoopQuestions;

import java.util.*;

public class question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice (0/1): ");
        int a = sc.nextInt();

        if (a==1) {
            System.out.println("Enter the obtained marks in Maths: ");
            int m = sc.nextInt();
            while (m>=90) {
                System.out.println("This is Good");
            }
            while (m>=60&&m<=89) {
                System.out.println("This is also Good");
            }
            while (m>=0&&m<=59) {
                System.out.println("This is Good as well, work hard");
            }
            System.out.println("Enter the obtained marks in Physics: ");
            int p = sc.nextInt();
            while (p>=90) {
                System.out.println("This is Good");
            }
            while (p>=60&&p<=89) {
                System.out.println("This is also Good");
            }
            while (p>=0&&p<=59) {
                System.out.println("This is Good as well, work hard");
            }
            System.out.println("Enter the obtained marks in Chemistry: ");
            int ch = sc.nextInt();
            while (ch>=90) {
                System.out.println("This is Good");
            }
            while (ch>=60&&ch<=89) {
                System.out.println("This is also Good");
            }
            while (ch>=0&&ch<=59) {
                System.out.println("This is Good as well, work hard");
            }
            System.out.println("Enter the obtained marks in English: ");
            int e = sc.nextInt();
            while (e>=90) {
                System.out.println("This is Good");
            }
            while (e>=60&&e<=89) {
                System.out.println("This is also Good");
            }
            while (e>=0&&e<=59) {
                System.out.println("This is Good as well, work hard");
            }
            System.out.println("Enter the obtained marks in Computer: ");
            int co = sc.nextInt();
            while (co>=90) {
                System.out.println("This is Good");
            }
            while (co>=60&&co<=89) {
                System.out.println("This is also Good");
            }
            while (co>=0&&co<=59) {
                System.out.println("This is Good as well, work hard");
            }
        }
        else if (a==0){
            System.out.println("Thank you for visiting!");
        }
        else{
            System.out.println("Please Enter a valid number.");
        }
    }
}

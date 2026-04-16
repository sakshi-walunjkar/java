package Recursion;

import java.util.Scanner;

public class palindrome_no {
    public static void palindrome(int temp, int rev, int n) {
        if (temp == 0) { 
            if (rev == n) {
                System.out.println("Palindrome Number");
            } else {
                System.out.println("Not Palindrome Number");
            }
            return;
        }
        int rem = temp % 10;
        palindrome(temp / 10, rev * 10 + rem, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close(); 
        palindrome( n, 0,n); 
    }
}

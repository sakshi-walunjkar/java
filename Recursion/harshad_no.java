package Recursion;

import java.util.Scanner;

public class harshad_no {
    public static void harshad(int sum, int n,int temp) {
        if (n == 0) { 
            if (temp % sum == 0) {
                System.out.println("Harshad Number");
            } else {
                System.out.println("Not Harshad Number");
            }
            return;
        }
        int rem = n % 10;
        harshad(sum + rem, n/ 10,temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close(); 
        harshad( 0, n,n); 
    }
}

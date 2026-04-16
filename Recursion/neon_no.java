package Recursion;

import java.util.Scanner;

public class neon_no {

    public static void neon(int squ, int sum, int n) {
        if (squ == 0) { 
            if (sum == n) {
                System.out.println("Neon Number");
            } else {
                System.out.println("Not Neon Number");
            }
            return;
        }
        int rem = squ % 10;
        neon(squ / 10, sum + rem, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();

        int squ = n * n; 
        neon(squ, 0, n); 
    }
}

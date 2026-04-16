package Recursion;

import java.util.Scanner;

public class amstrong_no {
    public static void neon(int cube, int sum, int n) {
        if (n == 0) {
            if (sum == cube) {
                System.out.println("Amstrong Number");
            } else {
                System.out.println("Not Amstrong Number");
            }
            return;
        }
        int rem = n % 10;
        sum = sum + (rem * rem * rem);
        neon(cube, sum, n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();

        neon(n, 0, n);
    }
}

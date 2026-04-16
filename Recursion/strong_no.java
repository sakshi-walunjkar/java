package Recursion;

import java.util.Scanner;

public class strong_no {
    public static int fact1(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact1(n - 1);
    }
    public static int strong(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return fact1(rem) + strong(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();

        int sum = strong(n);

        if (sum == n) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}

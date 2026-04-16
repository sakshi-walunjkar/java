package Recursion;

import java.util.Scanner;

public class prime_no {
    public static void prime(int n, int i) {
        if (i == n) {
            System.out.println("prime number");
            return;
        }
        if (n<= 1) {
            System.out.println(" Not Prime number");
            return ;
        }
        if (n % i == 0) {
            System.out.println("Not prime number");
            return;
        }
        prime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        prime(n, 2);
    }
}

package Recursion;

import java.util.Scanner;

public class spy_no {

    public static void spy(int n, int sum, int mult) {
        if (n == 0) {
            if (sum == mult) {
                System.out.println("Spy Number");
            } else {
                System.out.println("Not Spy Number");
            }
            return;
        }

        int rem = n % 10;
        spy(n / 10, sum + rem, mult * rem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();

        spy(n, 0, 1);
    }
}

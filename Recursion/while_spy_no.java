package Recursion;

import java.util.Scanner;

public class while_spy_no {
    public static void spy(int n) {
        int mult = 1;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            mult = mult * rem;
            n = n / 10;
        }

        if (sum == mult) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();

        spy(n);
    }
}

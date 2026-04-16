package Recursion;

import java.util.Scanner;

public class perfect_no {

    public static void perfect(int n, int sum, int i) {
        if (i == 0) {  
            if (n == sum) {
                System.out.println("perfect number");
            } else {
                System.out.println("not perfect number");
            }
            return;
        }
        if (n % i == 0) {
            sum = sum + i;
        }
        perfect(n, sum, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        perfect(n, 0, n / 2); 
    }
}

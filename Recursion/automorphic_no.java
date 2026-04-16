package Recursion;
import java.util.Scanner;

public class automorphic_no {
    static boolean automorphic(int n, int sq, int temp) {
        if (temp == 0) 
            return true;
        if (temp % 10 != sq % 10) 
            return false;
        return automorphic(n, sq / 10, temp / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();

        int square = n * n;
        if (automorphic(n, square, n))
            System.out.println(" is Automorphic");
        else
            System.out.println( " is Not Automorphic");
    }
}

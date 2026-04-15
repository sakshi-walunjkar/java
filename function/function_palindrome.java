import java.util.Scanner;

public class function_palindrome {
    public static int Palindrome(int n){
        int rem = 0;
        int temp = n; 
        int rev = 0;

        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();

        int rev =Palindrome(n);
        if (rev == n) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Is Not Palindrome");
        }

    }
}

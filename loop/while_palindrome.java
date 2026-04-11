import java.util.Scanner;
public class while_palindrome {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        sc.close();

        int rem = 0;
        int temp = n; 
        int rev = 0;

        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (rev == n) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Is Not Palindrome");
        }
    }
}

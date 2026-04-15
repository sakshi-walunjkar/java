import java.util.Scanner;

public class range_palindrome {
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
        System.out.print("Enter start Number:");
        int start=sc.nextInt();
        System.out.print("Enter end Number:");
        int end=sc.nextInt();
        sc.close();
        
        for(int i=start;i<=end;i++){
        int rev =Palindrome(i);
            if (rev == i) {
                System.out.println(i+" : Is Palindrome");
            } else {
                System.out.println(i+" : Is Not Palindrome");
            }
        }
    }
}

import java.util.Scanner;

public class function_even{
    public static boolean even (int n) {
        return n%2==0;
    }
    public static boolean odd (int n) {
        return n%2!=0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number");
        int n =sc.nextInt();
        sc.close();

        boolean even1 =even(n);
        System.out.println("Number is Even :"+even1);

        boolean odd1 =odd(n);
        System.out.println("Number is Odd :"+odd1);
    }
}

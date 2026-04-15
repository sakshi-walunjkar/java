import java.util.Scanner;

public class function_pos {
    public static boolean pos (int n) {
        return n>=0;
    }
    public static boolean neg (int n) {
        return n<=0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  Number :");
        int n =sc.nextInt();
        sc.close();

        boolean positive =pos(n);
        System.out.println("Number is Positive :"+positive);

        boolean negative =neg(n);
        System.out.println("Number is Negative :"+negative);
    }
}

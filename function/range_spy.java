import java.util.Scanner;

public class range_spy {
    public static int isspy(int n){
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
    public static int mult(int n){
        int mult = 1;
        while(n > 0){
            int rem = n % 10;
            mult = mult * rem;
            n = n / 10;
        }
        return mult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number: ");
        int start = sc.nextInt();
        System.out.print("Enter end Number: ");
        int end = sc.nextInt();
        sc.close();

        for(int i = start; i <= end; i++){
            int sum = isspy(i);
            int mult = mult(i);

            if (sum == mult) {
                System.out.println(i + " is Spy Number");
            } else {
                System.out.println(i + " is Not Spy Number");
            }
        }
    }
}

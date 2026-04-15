import java.util.Scanner;

public class range_factorial {
    public static int fact1(int n){
        int fact=1;
        int i;
        for(i=1;i<=n;i++){
        fact = fact*i;
        }
        return fact;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter start Number:");
        int start=sc.nextInt();
        System.out.print("Enter end Number:");
        int end=sc.nextInt();
        sc.close();
        
        for(int i=start;i<=end;i++){
        int factorial = fact1(i);
        System.out.println("Factorial :"+factorial);

        }
    }
}

import java.util.Scanner;

public class function_factorial {
    public static int fact1(int n){
        int fact=1;
        int i;
        for(i=1;i<=n;i++){
        fact = fact*i;
        }
        return fact;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial number:");
        int n=sc.nextInt();
        sc.close();

        int factorial = fact1(n);
        System.out.println("Factorial :"+factorial);

    }
    
}

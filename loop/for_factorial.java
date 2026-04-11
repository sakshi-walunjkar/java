import java.util.Scanner;
public class for_factorial {
    public static void main(String[] args) {
        int i,n;
        int fact = 1;

        Scanner sc =new Scanner(System.in);

        System.out.println("Factorial number:");
        n=sc.nextInt();

        for(i=1;i<=n;i++){
        fact=fact*i;
        sc.close();
        }
        System.out.println(fact);
    }
    
}

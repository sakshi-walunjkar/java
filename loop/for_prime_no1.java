import java.util.Scanner;
public class for_prime_no1 {
    public static void main(String[] args) {
        int i,n;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        sc.close();

        if (n<= 1) {
            System.out.println(n+ " is NOT a Prime number.");
            return;
        }
        for(i=2;i<n;){
            if(n%i==0){
                System.out.println("not prime number");
                return;
            }
            else{
                System.out.println(" prime number");
                return;
            }
        }
    }
    
}

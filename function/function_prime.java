import java.util.Scanner;

public class function_prime {
    public static int prime(int n){

        if (n<= 1) {
            System.out.println(n+ " is NOT a Prime number.");
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();

        for(int i=2;i<n;){
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

import java.util.Scanner;

public class range_prime {
    public static int prime(int n){

        if (n<= 1) {
            return 0;
        }

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter start Number:");
        int start=sc.nextInt();
        System.out.print("Enter end Number:");
        int end=sc.nextInt();
        sc.close();
        
        for(int i=start;i<end;i++){
            int n = prime(i);
            if (n == 1) {
                System.out.println(i+ " :Prime Number");
            }
            else{
                System.out.println(i+" :Not Prime Number");
            }
            
        }
    }
}

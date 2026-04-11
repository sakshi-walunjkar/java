import java.util.Scanner;
public class while_prime_no2 {
    public static void main(String[] args) {
        int n,i;
        int count=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();

        sc.close();

        if(n<=1){
            System.out.println("Not prime");
        }
        else{
            for(i=2;i<n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if (count == 0) {
                System.out.println( "  Prime");
            } else {
                System.out.println("  Not Prime ");
            }
        }
    }
    
}

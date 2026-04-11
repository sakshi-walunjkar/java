import java.util.Scanner;
public class for_prime_no {
    public static void main(String[] args) {
        int i,n;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        sc.close();

        System.out.println("sum of Factor");
        for(i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
            if(sum==1){
                System.out.println("prime number:");
                }
            else{
                System.out.println("not prime number:");
                }
    }
    
}

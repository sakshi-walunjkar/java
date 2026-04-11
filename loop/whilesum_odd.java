import java.util.Scanner;
public class whilesum_odd {
    public static void main(String[] args) {
        int rem, n;
        int sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        sc.close();


        System.out.println("Reverse Number:");
        while(n>0){
            rem=n%10;
            System.out.println(rem);
            if (rem%2!=0){
                sum=sum+rem;
                }
            n=n/10;

        }
        System.out.println("sum of odd number");
        System.err.println(sum);
    }
    
}

import java.util.Scanner;
public class whilesum_even {
    public static void main(String[] args) {
        int rem, n;
        int sum=0;
        int count=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        sc.close();


        System.out.println("Reverse Number:");
        while(n>0){
            rem=n%10;
            System.out.println(rem);
            count++;


            if (rem%2==0){
                sum=sum+rem;
            }
            n=n/10;

        }
        System.out.println("sum of even number");
        System.err.println(sum);

        System.out.println("count of  number");
        System.err.println(count);
    }
    
}

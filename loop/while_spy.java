import java.util.Scanner;
public class while_spy {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();

        sc.close();
        int mult=1;
        int sum =0;

        while(n>0){

            int rem=n%10;
            System.out.println(rem);
            sum=sum+rem;
            mult=mult*rem;

            n=n/10;
        }

        System.out.println("sum of numer"+sum);
        System.out.println("multiplication of number"+mult);

        if(sum==mult){
            System.out.println("Spy Number");
        }
        else{

            System.out.println("Not Spy Number");
        }
    }
    
}

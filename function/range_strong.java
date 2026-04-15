import java.util.Scanner;

public class range_strong {
    public static int factorial(int n){
        int fact=1;
        int i;
        for(i=1;i<=n;i++){
        fact = fact*i;
        }
        return fact;
    }

    public static int isstrong(int n){
        int sum=0;

        while(n>0){
            int rem=n%10;
            sum=sum+factorial(rem);
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number:");
        int start=sc.nextInt();
        System.out.print("Enter end Number:");
        int end=sc.nextInt();
        sc.close();
        
        for(int i=start;i<=end;i++){
        int sum = isstrong(i);
            if (i==sum){
                System.out.println(i+ " : Number is Strong Number");
            }
            else{
                System.out.println( i+ " : Number is not Strong Number");
            }
        }
    }
}

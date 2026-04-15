import java.util.Scanner;

public class function_strongno {
    
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
        System.out.println("Enter number:");
        int n=sc.nextInt();
        sc.close();
        
        int sum = isstrong(n);
        if (n==sum){
            System.out.println(sum+ " : Number is Strong Number");
        }
        else{
            System.out.println( sum+ " : Number is not Strong Number");
        }
        
    }
}

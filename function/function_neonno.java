import java.util.Scanner;

public class function_neonno {
    public static int isneon(int n){
        int sum=0;
        int square=n*n;
        System.out.println("square is "+square);

        while(square>0){
        int rem=square%10;
        sum=sum+rem;
        
        square=square/10;
    
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        sc.close();
        
        int sum = isneon(n);
        if(sum==n){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}

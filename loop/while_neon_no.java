import java.util.Scanner;
public class while_neon_no {
    public static void main(String[] args) {
        int n;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();
        sc.close();
        
        int sum=0;
        int square=n*n;
        System.out.println("square is "+square);

        while(square>0){
        int rem=square%10;
        sum=sum+rem;
        
        square=square/10;
    
        }
        System.out.println("Sum of square number is "+sum);

        if(sum==n){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
    
}

import java.util.Scanner;

public class function_harshad {
    public static int harshad(int n){
        int sum=0;

        while(n>0){
        int rem=n%10;
        sum=sum+rem;
        n=n/10;
    
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        sc.close();
        
        int sum = harshad(n);
        System.out.println("sum is :" +sum);
        if(n%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
    }
}

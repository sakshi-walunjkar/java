import java.util.Scanner;
public class while_harshad_no {
    public static void main(String[] args) {
        int n;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();
        sc.close();
        int sum=0;

        while(n>0){
        int rem=n%10;
        System.out.println(rem);
        sum=sum+rem;
        
        n=n/10;
    
        }
        System.out.println("sum of number "+sum);

        if(n%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
    }
    
}

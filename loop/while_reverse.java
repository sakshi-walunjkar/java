import java.util.Scanner;
public class while_reverse {
    public static void main(String[] args) {
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
        
        int rev=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("Is Palindrome");
        }
        else{
            System.out.println("Is Not Palindrome");
        }
    }
    
}

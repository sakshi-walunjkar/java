import java.util.Scanner;

public class range_harshad {
    public static int isharshad(int n){
        int sum=0;

        while(n>0){
        int rem=n%10;
        System.out.println(rem + " ");
        sum=sum+rem;
        n=n/10;
    
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter start Number:");
        int start=sc.nextInt();
        System.out.print("Enter end Number:");
        int end=sc.nextInt();
        sc.close();
        
        for(int i=start;i<=end;i++){
            int sum = isharshad(i);
            if (i % sum == 0) {

                System.out.println(i+ " :Harshad Number");
            }
            else{
                System.out.println(i+" :Not Harshad Number");
            }
        }
    }
}

import java.util.Scanner;

public class function_spyno {
    public static int isspy(int n){
        int mult=1;
        int sum =0;

        while(n>0){

            int rem=n%10;
            sum=sum+rem;
            mult=mult*rem;
            n=n/10;
        }
        return sum;     

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        sc.close();
        
        int sum=isspy(n);
        int mult=isspy(n);
        System.out.println(sum+ " : Sum of Number");
        System.out.println(mult+ " : multi of Number");

        if(sum==mult){
            System.out.println("Spy Number");
        }
        else{

            System.out.println("Not Spy Number");
        }

    }
    
}

import java.util.Scanner;

public class function_amstrong {
    public static int isamstrong(int n){
        int sum=0;
        int cube=0;
        while(n>0){
            int rem=n%10;
            System.out.print(rem + " ");
            cube=rem*rem*rem;
            System.out.println(" = "+cube);
            sum=sum+cube;
                n=n/10;
            }
            return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        sc.close();

        int sum = isamstrong(n);
        if (n==sum){
            System.out.println(sum+ " : Number is Amtrong Number");
        }
        else{
            System.out.println( sum+ " : Number is not Amtrong Number");
        }
    }
    
}

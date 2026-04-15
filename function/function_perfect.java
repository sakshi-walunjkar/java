import java.util.Scanner;

public class function_perfect {
    public static int isperfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        sc.close();
        
        int sum =isperfect(n);
        System.out.println("Sum of the number :"+sum);
        if(n==sum){
                System.out.println("perfect number");
                }
            else{
                System.out.println("not perfect number");
                }
    }
    
}

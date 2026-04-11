import java.util.Scanner;
public class while_amstrong {
    public static void main(String[] args) {
        int n;
        int sum=0;
        int cube=0;
    

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
        int temp=n;
        
        while(n>0){
            int rem=n%10;
            cube=rem*rem*rem;
            System.out.println("cube of "+rem+" is "+cube);
            sum=sum+cube;
                n=n/10;
            }
        System.out.println("sum of cube of digit is "+sum);
        if(temp==sum){
            System.out.println("Amstrong Numer");
        }
        else{
            System.out.println("Not Amstrong Number");
        }
    }
    
}

import java.util.Scanner;

public class range_neon {
    public static int isneon(int n){
        int sum=0;
        int square=n*n;
        System.out.println(n+ " : square is "+square);

        while(square>0){
        int rem=square%10;
        sum=sum+rem;
        
        square=square/10;
    
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
            int sum = isneon(i);
            if (sum == i) {

                System.out.println(i+ " is Neon Number");
            }
            else{
                System.out.println(i+" is Not Neon Number");
            }
        }
    }
}

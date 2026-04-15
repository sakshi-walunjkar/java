import java.util.Scanner;

public class range_amstrong {
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
        System.out.print("Enter start Number:");
        int start=sc.nextInt();
        System.out.print("Enter end Number:");
        int end=sc.nextInt();
        sc.close();
        
        for(int i=start;i<=end;i++){
        if(isamstrong(i)==i){
            System.out.println(i+ " : Number is Amtrong Number");
        }
        else{
            System.out.println(i+" : Number is Not Amtrong Number");
        }
    }
}
}

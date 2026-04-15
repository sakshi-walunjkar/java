import java.util.Scanner;

public class range_perfect {
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
        System.out.print("Enter start Number:");
        int start=sc.nextInt();
        System.out.print("Enter end Number:");
        int end=sc.nextInt();
        sc.close();
        
        for(int i=start;i<=end;i++){
            int sum = isperfect(i);
            if (i == sum) {

                System.out.println(i+ " :perfect Number");
            }
            else{
                System.out.println(i+" :Not perfect Number");
            }
        }
    }
}

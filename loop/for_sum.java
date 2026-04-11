import java.util.Scanner;
public class for_sum {
    public static void main(String[] args) {
        int i,start,end;
        int sum = 0;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter start number");
        start=sc.nextInt();

        System.out.println("enter end number");
        end=sc.nextInt();

        System.out.println("sum of number");
        for(i=start;i<=end;i++){
        sum=sum+i;
        sc.close();
        }
        System.out.println(sum);
    }
    
}

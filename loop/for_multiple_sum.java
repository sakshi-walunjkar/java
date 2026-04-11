import java.util.Scanner;
public class for_multiple_sum {
    public static void main(String[] args) {
        int i,n;
        int sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the table number:");
        n=sc.nextInt();

        for(i=1;i<=10;i++){
            System.out.println(i*n);
            sum=sum+i*n;
            sc.close(); 
            }
            System.out.println("sum:");
            System.out.println(sum);
    }
    
}

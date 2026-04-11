import java.util.Scanner;

public class for_multiple_count {
    public static void main(String[] args) {
        int i,n;
        int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the table number:");
        n=sc.nextInt();

        for(i=1;i<=10;i++){
            System.out.println(i*n);
            count++;
            sc.close(); 
            }
            System.out.println("Count:");
            System.out.println(count);
    }
    
}

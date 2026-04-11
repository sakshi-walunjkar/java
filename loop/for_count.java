import java.util.Scanner;

public class for_count {
    public static void main(String[] args) {
        int i,start,end;
        int count = 0;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter start number");
        start=sc.nextInt();

        System.out.println("enter end number");
        end=sc.nextInt();

        System.out.println("count of number");
        for(i=start;i<=end;i++){
        count++;
        sc.close();
        }
        System.out.println(count);
    
    }
}

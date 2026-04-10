import java.util.Scanner;
public class if_odd_count {
    public static void main(String[] args) {
        int i,start,end;
        int count=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter start number");
        start=sc.nextInt();

        System.out.println("enter end number");
        end=sc.nextInt();

        System.out.println("Odd number:");
        for(i=start;i<=end;i++){
                if(i % 2 != 0){
                System.out.println(i);
                count++;
                }
                sc.close();
            }
            System.out.println("Count:");
            System.out.println(count);
    }
    
}

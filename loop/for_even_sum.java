import java.util.Scanner;
public class for_even_sum {
    public static void main(String[] args) {
        int i,start,end;
        int sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter start number");
        start=sc.nextInt();

        System.out.println("enter end number");
        end=sc.nextInt();

        System.out.println("Even number:");
        for(i=start;i<=end;i++){
                if(i % 2 == 0){
                System.out.println(i);
                sum=sum+i;
                }
                sc.close();
            }
            System.out.println("Sum:");
            System.out.println(sum);
    }
    
}

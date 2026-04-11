import java.util.Scanner;
public class for_break {
    public static void main(String[] args) {
        int i,start,end;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter start number");
        start=sc.nextInt();

        System.out.println("enter end number");
        end=sc.nextInt();
        sc.close();

        for(i=start;i<=end;i++){
            if(i==5){ 
                continue;
            }
            System.out.println(i);
        }
    }
    
}

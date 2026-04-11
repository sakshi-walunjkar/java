import java.util.Scanner;
public class while_reverse_num {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        sc.close();
        
        System.out.println("Reverse Number:");
        while(n>0){
            int rem=n%10;
            System.out.println(rem);
            n=n/10;
        }
        
    }
}

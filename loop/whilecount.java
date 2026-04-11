import java.util.Scanner;
public class whilecount {
    public static void main(String[] args) {
        int n;
        int count=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        sc.close();
        
        while(n>0){
            count++;
        }
        System.out.println("count of  number");
        System.err.println(count);
    }
    
}

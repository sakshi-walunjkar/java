import java.util.Scanner;
public class for_multiple {
    public static void main(String[] args) {
        int i;
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();

        for(i=1;i<=10;i++){
            System.out.println(i*n);
            sc.close(); 
            }    
    }
}

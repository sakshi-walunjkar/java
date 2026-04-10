import java.util.Scanner;
public class if_greater {
    public static void main(String[] args) {
        int a , b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a :");
        a = sc.nextInt();

        System.out.println("Enter the b :");
        b = sc.nextInt();

        System.out.println("Enter the c :");
        c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("a is greater than b & c");
        }
        else if(b>=a && b>=c){
            System.out.println("b is greater than a & c");
        }
        else{

            System.out.println("c is greater than a & b");
        }
    sc.close();
    }
    
}

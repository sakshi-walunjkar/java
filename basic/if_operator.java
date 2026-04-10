import java.util.Scanner;
public class if_operator {
    public static void main(String[] args) {
        char c ;
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a:");
        a = sc.nextInt();
        System.out.println("Enter the b:");
        b = sc.nextInt();
        System.out.println("Enter the operators:");
        c = sc.next().charAt(0);
    
        if(c=='+'){
            System.out.println(a+b);
        }
        else if(c=='-'){
            System.out.println(a-b);
        }
        else if(c=='*'){
            System.out.println(a*b);
        }
        else if(c=='/'){
            System.out.println(a/b);
        }
        else if(c=='%'){
            System.out.println(a%b);
        }
        else{

            System.out.println("Invalid");
        }
    sc.close();
    }
    
}

import java.util.Scanner;
public class if_pos_neg {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        a = sc.nextInt();

        if (a>=0){
            System.out.println("Number is positive");

        }
        else{
            System.out.println("Number is negative");
        }
    sc.close();
    }
    
}

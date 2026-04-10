import java.util.Scanner;

public class if_digit {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();

        if (num>=-9 && num <=9){
            System.out.println(" Digit");
        }
        else{
            System.out.println("Number");
        }
        sc.close();
    }
    
}

import java.util.Scanner;
public class if_odd_even {
    public static void main(String[] args) {
        int no ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        no = sc.nextInt();
        
        if (no % 2 == 0) 
        {
            System.out.println("Number is even");

        }
        else{
            System.out.println("Number is odd");
        }
    sc.close();
    }
}

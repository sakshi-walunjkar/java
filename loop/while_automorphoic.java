import java.util.Scanner;

public class while_automorphoic {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        n = sc.nextInt();
        sc.close();

        int square = n * n;
        System.out.println("square is " + square);

        int temp = n;
        int flag = 0;

        while (temp > 0) {
            int rem = temp % 10;        
            int lastsquare = square % 10;     

            if (rem != lastsquare) {
                flag = 1;
                break;
            }

            temp = temp / 10;           
            square = square / 10;       
        }

        if (flag == 0) {
            System.out.println("automorphic");
        } else {
            System.out.println("not automorphic");
        }
    }
}

package Array;
import java.util.Scanner;

public class neon_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // input array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("Neon Numbers in array: ");
        for (int i = 0; i < size; i++) {
            int num = arr[i];
            int square = num * num;
            int sum = 0;

            // sum of digits of square
            while (square > 0) {
                int rem = square % 10;
                sum += rem;
                square /= 10;
            }

            // check Neon condition
            if (sum == num) {
                System.out.print(num + " "); // print in same line
            }
        }
    }
}

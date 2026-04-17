package Array;
import java.util.Scanner;

public class spy_no {
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

        System.out.print("Spy Numbers in array: ");
        for (int i = 0; i < size; i++) {
            int num = arr[i];
            int temp = num;
            int sum = 0;
            int mult = 1;

            // calculate sum and product of digits
            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + rem;
                mult = mult * rem;
                temp = temp / 10;
            }

            // check Spy condition
            if (sum == mult) {
                System.out.print(num + " ");
            }
        }
    }
}

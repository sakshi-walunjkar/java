package Array;
import java.util.Scanner;

public class harshada_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("Harshad Numbers in array: ");
        for (int i = 0; i < size; i++) {
            int num = arr[i];
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + rem;
                temp = temp / 10;
            }

            if (num % sum == 0) {
                System.out.print(num + " "); // print directly
            }
        }
    }
}

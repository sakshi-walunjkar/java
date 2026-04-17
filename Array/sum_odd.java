package Array;
import java.util.Scanner;

public class sum_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum =0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Odd Numbers:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                sum=sum+arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n Sum is:"+sum);
    }
}

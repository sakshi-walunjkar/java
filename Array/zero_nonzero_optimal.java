package Array;

import java.util.Arrays;
import java.util.Scanner;

public class zero_nonzero_optimal {
    public static void zero_nonzero_optimal1(int[] arr, int start, int end) {
        while (start < end) {
            if (arr[start] %2 == 0) {
                start++;
            } else if (arr[end] %2 != 0) {
                end--;
            } else {
                arr[start] = arr[start] + arr[end];
                arr[end] = arr[start] - arr[end];
                arr[start] = arr[start] - arr[end];

                start++;
                end--;
            }
        }
    }

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

        zero_nonzero_optimal1(arr, 0, size - 1);

        System.out.println("Array is : " + Arrays.toString(arr));
    }
}

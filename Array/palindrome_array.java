package Array;

import java.util.Scanner;
import java.util.Arrays;

public class palindrome_array {
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

        if (isPalindromeArray(arr, size)) {
            System.out.println("Palindrome array: " + Arrays.toString(arr));
        } else {
            System.out.println("Not a palindrome array: " + Arrays.toString(arr));
        }
    }
    public static boolean isPalindromeArray(int[] arr, int size) {
        for (int i = 0; i < size / 2; i++) {
            if (arr[i] != arr[size - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

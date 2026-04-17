package Array;
import java.util.Scanner;
import java.util.Arrays;

public class even_odd {
    public static void rearrangeEvenOdd(int[] arr) {
        int index = 0;  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
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

        rearrangeEvenOdd(arr);

        System.out.println("Array is : " + Arrays.toString(arr));
    }
}


package Array;
import java.util.Scanner;
import java.util.Arrays;

public class zero_nonzero {
    public static void zero_nonzero1(int[] arr) {
        int index = 0;  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]  != 0) {
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

        zero_nonzero1(arr);

        System.out.println("Array is : " + Arrays.toString(arr));
    }
}



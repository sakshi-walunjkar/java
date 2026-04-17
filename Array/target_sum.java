package Array;

import java.util.Arrays;
import java.util.Scanner;

public class target_sum {
    public static void target_sum1(int[] arr,int start,int end) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
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

        target_sum1(arr, 0, size - 1);

        System.out.println("Array is : " + Arrays.toString(arr));
    }
}


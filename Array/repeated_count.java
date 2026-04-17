package Array;

import java.util.Scanner;

public class repeated_count {
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

        System.out.print("Repeated count in array: ");
        for(int i=0; i<size; i++){
            int count = 1;

            // mark as visited
            for(int j=i+1;j<size;j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr[j]= -1;
                }
            }
                if (arr[i] != -1 && count > 1) { 
                System.out.println(arr[i] + " is repeated " + count + " times");
            }
        }
    }
}

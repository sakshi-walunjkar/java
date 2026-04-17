package Array;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size:");
        int size =sc.nextInt();
        int[] arr=new int [size];
        
        for (int i=0;i<size;i++){
            System.out.print("Enter the Element:");
            arr[i]=sc.nextInt();
        }
        sc.close();
            System.out.println("Array is : " + Arrays.toString(arr));
    }
    
}

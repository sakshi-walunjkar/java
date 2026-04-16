package Recursion;

import java.util.Scanner;

public class reverse {
    public static void display(int start ,int end){
        if(start<1){
            return;
        }
        System.out.println(start);
        display(start-1, end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number:");
        int start=sc.nextInt();
        System.out.print("Enter end Number:");
        int end=sc.nextInt();
        sc.close();
        display(start,end);
    }
}

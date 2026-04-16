package Recursion;

import java.util.Scanner;

public class factorial {
    public static int fact1(int i,int fact){
        if(i==1){
            return fact;
        }
            fact = fact*i;
            return fact1(i-1,fact);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int i=sc.nextInt();
        sc.close();
        
        int factorial=fact1(i, 1);
        System.out.println("Factorial:"+factorial);
    }
}

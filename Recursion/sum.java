package Recursion;

import java.util.Scanner;

public class sum {
    public static int sum1(int start,int end,int s){
        if(start>end){
            return s;
        }
        s=s+start;
        return sum1(start+1, end, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number:");
        int start=sc.nextInt();
        System.out.print("Enter end Number:");
        int end=sc.nextInt();
        sc.close();
        int add=sum1(start, end, 0);
        System.out.println("Addition:"+add);
    }
}

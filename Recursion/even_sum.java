package Recursion;

import java.util.Scanner;

public class even_sum {
    public static int sum(int start,int end,int s){
        if(start>end){
            return s;
        }
        if(start%2==0){
            s=s+start;
        }
        return sum(start+1, end, s);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number:");
        int start=sc.nextInt();
        System.out.print("Enter end Number:");
        int end=sc.nextInt();
        sc.close();
        int add=sum(start, end, 0);
        System.out.println("Addition of even number:"+add);
    }
}

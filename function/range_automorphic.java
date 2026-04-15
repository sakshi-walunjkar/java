import java.util.Scanner;

public class range_automorphic {
    public static int automorphic(int n){

        int square = n * n;
        System.out.println("square is " + square);
        int temp = n;
        int flag = 0;

        while (temp > 0) {
            int rem = temp % 10;        
            int lastsquare = square % 10;     

            if (rem != lastsquare) {
                flag = 1;
                break;
            }

            temp = temp / 10;           
            square = square / 10;       
        }
        return flag;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter start Number:");
        int start=sc.nextInt();
        System.out.print("Enter end Number:");
        int end=sc.nextInt();
        sc.close();
        
        for(int i=start;i<=end;i++){
            int flag = automorphic(i);
            if (flag == 0) {

                System.out.println(i+ " :Automorphic Number");
            }
            else{
                System.out.println(i+" :Not Automorphic Number");
            }
        }
    }
}

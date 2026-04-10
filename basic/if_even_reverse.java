import java.util.Scanner;
public class if_even_reverse {
    public static void main(String[] args) {
        int rem, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        sc.close();


        System.out.println("Reverse Number:");
        while(n>0){
            rem=n%10;
            System.out.println(rem);
            

            if (rem%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
            n=n/10;
        }

    }
}

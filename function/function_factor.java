import java.util.Scanner;

public class function_factor {
    public static int factor (int n){
        int i;
        int fact =1;
        for(i=1;i<n;i++){
            if(n%i==0){
                fact=i;
                System.out.println(fact);
            }
        }
        return i;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Factor number:");
        int n=sc.nextInt();
        sc.close();

        int factor1 = factor(n);
        System.out.println(factor1); //optional 
        
    }
}

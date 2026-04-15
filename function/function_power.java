import java.util.Scanner;

public class function_power {

    public static int power(int b,int e){
        int i;
        int power=1;

        for(i=1;i<=e;i++){
        power=b*power;
        }
        return power ;
    }

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter base number");
        int b=sc.nextInt();

        System.out.println("enter exponent number");
        int e=sc.nextInt();
        sc.close();

        int power1 = power(b, e);
        System.out.println("Power"+power1);

    }
}

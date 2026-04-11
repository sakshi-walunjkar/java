import java.util.Scanner;
public class for_power {
    public static void main(String[] args) {
        int base,exponant;
        int i;
        int power=1;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter base number");
        base=sc.nextInt();

        System.out.println("enter exponent number");
        exponant=sc.nextInt();

        System.out.println("power");
        for(i=1;i<=exponant;i++){
        power=base*power;
        sc.close();
        }
        System.out.println(power);
    }
    
}

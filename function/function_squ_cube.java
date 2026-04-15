
import java.util.Scanner;
public class function_squ_cube {
    public static int square(int a){
        return a*a;
    }

    public static int cube(int a){
        return a*a*a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  number");
        int a =sc.nextInt();

        int squ=square(a);
        System.out.println("square is :" +squ);

        int cu=cube(a);
        System.out.println("cube is:" +cu);

        sc.close();
    }
}

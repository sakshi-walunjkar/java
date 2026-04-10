import java.util.Scanner;
public class if_marks {
    public static void main(String[] args) {
        int math ;
        int eng ;
        int hindi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the math marks:");
        math = sc.nextInt();
        System.out.println("Enter the eng marks:");
        eng = sc.nextInt();
        System.out.println("Enter the hindi marks:");
        hindi = sc.nextInt();


        int  total = math+eng+hindi;
        int per = total /3 ;

        System.out.println(total);
        System.out.println(per);

        if (per>40){
            System.out.println("Teja pass");
        }
        else{
            System.out.println("Teja fail");
        }
        sc.close();
    }
    
}

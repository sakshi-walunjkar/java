import java.util.Scanner;
public class if_grade {
    public static void main(String[] args) {
        double math, eng ,hindi,oop,chem;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the math marks:");
        math = sc.nextDouble();
        System.out.println("Enter the eng marks:");
        eng = sc.nextDouble();
        System.out.println("Enter the hindi marks:");
        hindi = sc.nextDouble();
        System.out.println("Enter the oop marks:");
        oop = sc.nextDouble();
        System.out.println("Enter the chem marks:");
        chem = sc.nextDouble();


        double total = math+eng+hindi+oop+chem;
        double per = total /5 ;

        System.out.println(total);
        System.out.println(per);

        if(per>=90 && per<=100){
            System.out.println("Grade:O");
        }
        else if(per>=80 && per<90){
            System.out.println("Grade:A");
        }
        else if(per>=65 && per<80){
            System.out.println("Grade:B");
        }
        else if(per>=45 && per<65){
            System.out.println("Grade:C");
        }
        else {
            System.out.println("Fail");
        }
        sc.close();
    }
    
}

import java.util.Scanner;
public class if_alpha_no {
    public static void main(String[] args) {
        char sym ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the letter or symbol:");
        sym =sc.next().charAt(0);

        if(sym>='A' && sym<='Z'){
            System.out.println("Alphabet");

        }
        else if(sym>='a' && sym<='z'){

            System.out.println("Albhabet");
        }
        else if (sym>=-9 && sym <=9){
            System.out.println(" Digit");
        }
        else{
            System.out.println("Symbol");
        }
    sc.close();
    }
    
}

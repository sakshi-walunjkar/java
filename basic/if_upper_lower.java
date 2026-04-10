import java.util.Scanner;
public class if_upper_lower {
    public static void main(String[] args) {
        int sym ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the letter or symbol:");
        sym =sc.next().charAt(0);
        if(sym>=65 && sym<=90){
            System.out.println("Uppercase");

        }
        else{
            System.out.println("Lowercase");
        }
    sc.close();
    }
    
}

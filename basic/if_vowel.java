import java.util.Scanner;
public class if_vowel {
    public static void main(String[]args){
        char vo ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the letter:");
        vo =sc.next().charAt(0);

        if(vo=='a'|| vo=='e'||vo=='i'||vo=='0'||vo=='u'){
            System.out.println("Vowel");

        }
        else{

            System.out.println("consonaunt");
        }
    sc.close();
    }
    
}

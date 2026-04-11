import java.util.Scanner;
public class for_evenodd {
    public static void main(String[] args) {
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the :i");
        i=sc.nextInt();
        
        System.out.println("Even number:");
        for(i=1;i<=30;i++){
                if(i % 2 == 0){
                System.out.println(i);
                }
                sc.close();
            }
        System.out.println("Odd number:");
        for(i=1;i<=30;i++){
            
                if(i % 2 != 0){
                System.out.println(i);
                }
        
        }
    }
}
    


import java.util.Scanner;
public class if_factor {
    public static void main(String[] args) {
        int i,n;

        Scanner sc =new Scanner(System.in);

        System.out.println("Factor number:");
        n=sc.nextInt();

        System.out.println("Factor");
        for(i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
                sc.close();
            }
        }
    }
    
}

import java.util.Scanner;
public class if_day {
    public static void main(String[] args) {
        int day ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days:");
        day = sc.nextInt();
        
        if(day == 1){
            System.err.println("sun");
        
        }
        else if(day == 2){
            System.err.println("mon");
        }

        else if(day == 3){
            System.err.println("tue");
        }

        else if(day == 4){
            System.err.println("wed");
        }

        else if(day == 5){
            System.err.println("thu");
        }

        else if(day == 6){
            System.err.println("fri");
        }

        else if(day == 7){
            System.err.println("sat");
        }
        else{
            System.err.println("Invalid");
        }
        sc.close();
    }
    
}

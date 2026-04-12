public class pattern_star {
    public static void main(String[] args) {
        for(int i=3;i>=1;i--){
            for(int j=5;j>=1;j--){
                if(i==1 && j==3){
                    System.out.print(" * ");
                }
                else if (i==2 && j%2==0){
                    System.out.print(" * ");
                }
                else if(i==3 && j%2!=0){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}

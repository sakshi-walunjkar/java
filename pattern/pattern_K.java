public class pattern_K {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==1|| i==2 && j==2 ||i==1 && j==3 ||i==4 && j==2 ||i==5 && j==3){
                    System.err.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
}

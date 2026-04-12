public class pattern_G {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=3;j++){
                if(i==5|| j==1 || i==1 || i==3 ||i==4 && j==3){
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

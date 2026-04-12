public class pattern_Q {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==3 || i==1 &&j==2 || i==n &&j==2 || i==3 &&j==2 || i==n && j==4){
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

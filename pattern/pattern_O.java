public class pattern_O {
    public static void main(String[] args) {
        int n=5;
        int m=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j==1|| i==1 || i==n ||j==m){
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

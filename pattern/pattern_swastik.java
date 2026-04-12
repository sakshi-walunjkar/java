public class pattern_swastik {
    public static void main(String[] args) {
        int n=5;
        int m=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 && j>=m ){
                    System.err.print(" * ");
                }
                else if(i==n && j<=m ){
                    System.err.print(" * ");
                }
                else if(j==n && i>=m ){
                    System.err.print(" * ");
                }
                else if(j==1 && i<=m ){
                    System.err.print(" * ");
                }
                else if(i==m || j==m){
                    System.err.print(" * ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
    
}

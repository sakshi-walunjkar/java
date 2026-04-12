public class pattern_B {
    public static void main(String[] args) {
        int n=5;
        int m=3;
        int o=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==o){
                    System.err.print(" * ");
                }
                else if(i==n|| j==1 || i==1 || j==m){
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

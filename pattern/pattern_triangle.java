public class pattern_triangle {
    public static void main(String[] args) {
        int n=5;
        int m=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==m || j==m){
                    System.err.print(" * ");
                }
                else if(i==2 && j==2 || i==2 && j==4){
                    System.err.print(" * ");
                }
                else if(i==4  && j==2 || i==4 && j==4){
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

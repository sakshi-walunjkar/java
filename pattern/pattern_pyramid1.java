public class pattern_pyramid1 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3+i+1;j++){
                System.out.print(" ");
            }
            for(int k=3;k>i;k--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}

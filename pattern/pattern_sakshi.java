public class pattern_sakshi {
    public static void main(String[] args) {
        int n=5;
        int m=23;
        int o=n/2+1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 && j<=3 || i==n && j<=3|| i==o && j<=3||i==2 && j==1 || j==3 && i==4){
                    System.err.print(" ❤️ ");
                }
                else if(j==5 ||j==7 ||j==6 && i==o || i==1 && j==6){
                    System.err.print(" ❤️ ");
                }
                else if(j==9 || i==1 && j==11 || j==10 && i==2 || i==5 && j==11 || j==10 && i==4){
                    System.err.print(" ❤️ ");
                }
                else if(i==1 && j>=13 && j<=15 ||i==3 && j>=13 && j<=15 ||i==5 && j>=13 && j<=15 ||j==13 && i==2 ||j==15 && i==4){
                    System.err.print(" ❤️ ");
                }
                else if(j==17 || j==19 ||j==18 && i==o){
                    System.err.print(" ❤️ ");
                }
                else if(i==1 && j>=21 || i==5 && j>=21 ||j==22 ){
                    System.err.print(" ❤️ ");
                }
                
                else if(j==4 ||j==8 ||j==12 ||j==16 ||j==20){
                    System.out.print("   ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
}

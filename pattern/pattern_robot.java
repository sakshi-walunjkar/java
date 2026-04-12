public class pattern_robot {
    public static void main(String[] args) {
        int n=19;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 && j>=7 && j<=13 || i==6 && j>=8 && j<=13 || j==7 && i>=1 && i<=6 ||j==13 && i>=1 && i<=6){
                    System.err.print(" * ");
                }
                else if(j==9 && i>=7 && i<=8 || j==11 && i>=7 && i<=8){
                    System.err.print(" * ");
                }
                else if(i==9 && j>=4 && j<=16 ||i==15 && j>=4 && j<=16 ||j==4 && i>=9 && i<=15 || j==16 && i>=9 && i<=15){
                    System.err.print(" * ");
                }
                else if(i==3 && j>=8 && j<=9 || i==4 && j>=8 && j<=9 ||i==3 && j>=11 && j<=12 || i==4 && j>=11 && j<=12){
                    System.err.print(" * ");
                }
                else if(j==6 && i>=15 && i<=19 || j==8 && i>=15 && i<=19 ||j==12 && i>=15 && i<=19 || j==14 && i>=15 && i<=19){
                    System.err.print(" * ");
                }
                else if(i==19 && j==7 || i==19 && j==13){
                    System.err.print(" * ");
                }
                else if(i==10 && j>=1 && j<=3 || i==10 && j>=17 && j<=19 || j==1 && i>=11 && i<=15 ||j==19 && i>=11 && i<=15){
                    System.err.print(" * ");
                }
                else if(i==12 && j>=2 && j<=3 || i==12 && j>=17 && j<=18 ||j==2 && i>=13 && i<=15 ||j==18 && i>=13 && i<=15){
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

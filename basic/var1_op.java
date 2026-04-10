public class var1_op {
    public static void main(String[] args) {
        int x = 10,y = 3;
        x = ++y - y-- + x-- + ++x;
        System.out.println(x);
        System.out.println(y);
        
    }
    
}

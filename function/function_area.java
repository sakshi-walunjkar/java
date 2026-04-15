public class function_area {
    public static int square(int a){
        return a*a;
    }

    public static int rectriangle(int l ,int b){
        return l*b;
    }

    public static double triangle(int l ,int h){
        return l*h*0.5;
    }

    public static double circle(int r){
        return r*r*3.14;
    }

    public static void main(String[] args) {
        int squ=square(4);
        System.out.println("area of square :" +squ);

        int rec=rectriangle(3,4);
        System.out.println("area of rectriangle :" +rec);

        double tri=triangle(5,4);
        System.out.println("area of triangle :" +tri);

        double cir =square(4);
        System.out.println("area of circle :" +cir);
    }
}

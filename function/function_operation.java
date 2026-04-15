public class function_operation {
    public static int addition(int a ,int b){
        return a+b;
    }

    public static int substraction(int a ,int b){
        return a-b;
    }

    public static int multiplication(int a ,int b){
        return a*b;
    }

    public static int division(int a ,int b){
        return a/b;

    }
    public static void main(String[] args) {
        int sum = addition(20, 10);
        System.out.println("Sum is :" +sum);

        int sub = substraction(20, 10);
        System.out.println("Sub is :" +sub);

        int mult = multiplication(20, 10);
        System.out.println("mult is :" +mult);

        int div = division(20, 10);
        System.out.println("div is :" +div);
    }
}

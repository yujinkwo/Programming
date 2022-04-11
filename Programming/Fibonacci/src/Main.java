public class Main {
    public static int fibonacci(int n){
        if(n<=0){
            return 0;
        }
        else {
            return fibonacci(n-2) + (n+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
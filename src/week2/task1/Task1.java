package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        while (b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return fibonacci(n-1) +fibonacci(n-2);
    }
    public static void main(String[] arg){
        System.out.println(gcd(15,21));
        System.out.println(fibonacci(5));
    }
}

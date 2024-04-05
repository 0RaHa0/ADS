import java.util.Scanner;

public class Main {
    public static int  fun(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n*n+fun(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int x = fun(num1);
        System.out.println(x);

    }
}

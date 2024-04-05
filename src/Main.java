import java.util.Scanner;

public class Main {
    public static int  fun(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + fun(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x = fun(num);
        System.out.println(x);

    }
}

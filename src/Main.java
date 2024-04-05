import java.util.Scanner;

public class Main {
    public static void  fun(int n,Scanner scanner) {
        if (n > 0) {
            int num = scanner.nextInt();
            fun(n - 1, scanner);
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        fun(num,scanner);

    }
}

import java.util.Scanner;

public class Main {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            while (n > 1) {
                if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}

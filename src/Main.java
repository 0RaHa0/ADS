import java.util.Scanner;

public class Main {
    public static int  fun(int n,int m) {
        if (n == 0) {
            return 1;
        }
        else {
            return (int) (Math.pow(m,n) + fun(n-1,m));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();
        int num1 = scanner.nextInt();
        int x = fun(num1,num2);
        System.out.println(x);

    }
}

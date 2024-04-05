import java.util.Scanner;

public class Main {
    public static int  fun(int n,int[] arr) {
        if (n == 0) {
            return 0;
        }
        else {
            return arr [n-1] + fun(n-1,arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int num = scanner.nextInt();
        int x = fun(num,arr);
        System.out.println(x);

    }
}

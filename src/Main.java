import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void  fun(int n, int m, List<Integer> seq) {
        if (n == 0) {
            for (int num : seq) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 1; i <= m; i++){
                seq.add(i);
                fun(n-1,m,seq);
                seq.remove(seq.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        fun(n,m,new ArrayList<>());
    }
}

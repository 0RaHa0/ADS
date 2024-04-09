import java.util.Scanner;

public class Main {
    public static void  fun(int [][] matrix, int start , int size , int num ) {
        if (size == 1) {
            matrix[start][start] = num;
        }
        else {
            int end = start + size -1;
            for (int i = start; i < end; i++){
                matrix[start][i] = num++;
            }
            for (int i = start; i < end ; i++){
                matrix[i][end] = num++;
            }
            for (int i = end; i > start; i--){
                matrix[end][i]=num++;
            }
            for (int i = end; i>start; i--){
                matrix[i][start]=num++;
            }
            fun(matrix,start+1,size-2,num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        fun(matrix,0,n,1);
        for (int[]row:matrix){
            for (int num:row){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void  fun(char[] ch, List<Character> per,boolean[] use) {
        if (per.size()==ch.length) {
            for (char x : per) {
                System.out.print(x);
            }
            System.out.println();
        }
        else {
            for (int i = 0; i < ch.length; i++){
                if (!use[i]){
                    use[i]=true;
                    per.add(ch[i]);
                    fun(ch,per,use);
                    per.remove((per.size()-1));
                    use[i] = false;
                };
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] ch =input.toCharArray();
        boolean[] use = new boolean[ch.length];
        fun(ch,new ArrayList<>(),use);
    }
}

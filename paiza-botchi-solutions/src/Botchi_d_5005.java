import java.util.*;

public class Botchi_d_5005 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.valueOf(line);
        line = sc.nextLine();
        int w = Integer.valueOf(line);
        if (n >= w) {
            System.out.println(n - w);
        } else {
            System.out.println("error");
        }
    }
}

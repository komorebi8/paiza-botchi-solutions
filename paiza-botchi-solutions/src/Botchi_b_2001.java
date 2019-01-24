import java.util.Scanner;

public class Botchi_b_2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = sc.next();
        String s;
        for (int i = 0; i < n - 1; i++) {
            s = sc.next();
            int ansLength = ans.length();
            int maxLength = Math.min(ans.length(), s.length());
            boolean found = false;
            for (int j = maxLength; j >= 0; j--) {
                if (ans.substring(ansLength - j).equals(s.substring(0, j))) {
                    ans = ans + s.substring(j);
                    found = true;
                }
            }
            if (!found) {
                ans = ans + s;
            }
        }
        System.out.println(ans);
    }
}

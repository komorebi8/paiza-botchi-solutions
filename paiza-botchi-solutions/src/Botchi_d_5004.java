import java.util.Scanner;

public class Botchi_d_5004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            d = sc.nextInt();
            if (d > 5) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

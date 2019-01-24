import java.util.Scanner;

public class Botchi_c_3001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            int length = (i + "").length();
            for (int j = 0; j < n - length; j++) {
                System.out.print(0);
            }
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class Botchi_c_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a, b;
        int aWin = 0, bWin = 0;
        for (int i = 0; i < n; i++) {
            a = sc.next().charAt(0);
            b = sc.next().charAt(0);
            if ((a == 'g' && b == 'c') ||
                    (a == 'c' && b == 'p') ||
                    (a == 'p' && b == 'g')) {
                aWin++;
            } else if (a != b) {
                bWin++;
            }
        }
        System.out.println(aWin);
        System.out.println(bWin);
    }
}

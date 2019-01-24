import java.util.Scanner;

public class Botchi_d_4002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        int importency;
        for (int i = 0; i < n; i++) {
            s = sc.next();
            importency = sc.nextInt();
            if (importency == 3) {
                System.out.println(s);
            }
        }
    }
}

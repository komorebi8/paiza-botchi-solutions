import java.util.Scanner;

public class Botchi_b_2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        char c;
        boolean valid = true;
        for (int i = 0; i < n; i++) {
            c = sc.next().charAt(0);
            if (c == 'U')
                y = y + 1;
            if (c == 'D')
                y = y - 1;
            if (c == 'L')
                x = x - 1;
            if (c == 'R')
                x = x + 1;
            if (x < 0 || x >= w || y < 0 || y >= h)
                valid = false;
        }
        if (valid)
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
}

import java.util.Scanner;

public class Botchi_d_4003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        for (int i = 0; i < length; i = i + 2) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}

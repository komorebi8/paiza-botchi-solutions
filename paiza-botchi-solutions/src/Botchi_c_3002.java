import java.util.Scanner;

public class Botchi_c_3002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd = sc.next();
        pwd = pwd.toLowerCase();
        int length = pwd.length();
        boolean valid = true;

        if (length < 6) {
            valid = false;
        }

        boolean containsNumber = false;
        boolean containsLetter = false;
        for (int i = 0; i < length; i++) {
            char c = pwd.charAt(i);
            if (c >= '0' && c <= '9') {
                containsNumber = true;
            }
            if (c >= 'a' && c <= 'z') {
                containsLetter = true;
            }
        }
        if ((!containsLetter) || (!containsNumber)) {
            valid = false;
        }

        for (int i = 0; i < length - 3; i++) {
            int j = i + 1;
            int k = j + 1;
            if (pwd.charAt(i) == pwd.charAt(j) && pwd.charAt(j) == pwd.charAt(k)) {
                valid = false;
            }
        }

        if (valid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }


    }
}

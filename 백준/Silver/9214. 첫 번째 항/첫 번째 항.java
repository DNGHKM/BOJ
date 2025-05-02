import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        while (true) {
            String s = sc.nextLine();
            if (s.equals("0")) {
                break;
            }
            String ans = findFirst(s);
            sb.append("Test " + cnt + ": " + ans + "\n");
            cnt++;
        }
        System.out.println(sb);
    }

    private static String findFirst(String s) {
        while (s.length() > 1 && s.length() % 2 == 0 && !s.equals("22")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i += 2) {
                for (int j = 0; j < s.charAt(i) - '0'; j++) {
                    sb.append(s.charAt(i + 1));
                }
            }
            s = sb.toString();
        }
        return s;
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            sb.append(s);
            if (s.charAt(s.length() - 1) != '.') {
                sb.append(".");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
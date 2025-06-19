import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        topAndBottom(sb, n);
        for (int i = 0; i < 3 * n; i++) {
            for (int j = 0; j < 5 * n; j++) {
                if (j < n || 4 * n <= j) {
                    sb.append("@");
                    continue;
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        topAndBottom(sb, n);
        System.out.println(sb);
    }

    private static void topAndBottom(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(5 * n));
            sb.append("\n");
        }
    }
}


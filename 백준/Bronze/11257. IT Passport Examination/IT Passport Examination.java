import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            sb.append(num + " " + (a + b + c));
            if (a >= 11 && b >= 8 && c >= 12 && (a + b + c) >= 55) {
                sb.append(" PASS\n");
                continue;
            }
            sb.append(" FAIL\n");
        }
        System.out.println(sb);
    }
}

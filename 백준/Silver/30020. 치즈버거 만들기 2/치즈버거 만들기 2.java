import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = a - b;
        if (cnt > b || cnt <= 0) {
            System.out.println("NO");
            return;
        }
        sb.append("YES\n" + cnt + "\n");
        for (int i = 0; i < cnt - 1; i++) {
            sb.append("aba\n");
        }
        sb.append("a");
        for (int i = 0; i < b - (cnt - 1); i++) {
            sb.append("ba");
        }
        System.out.println(sb);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int ans = 0;
            ans += ((num / 3) * (num / 3 + 1)) / 2 * 3;
            ans += ((num / 7) * (num / 7 + 1)) / 2 * 7;
            ans -= ((num / 21) * (num / 21 + 1)) / 2 * 21;
            sb.append(ans + "\n");
        }
        System.out.println(sb);
    }
}
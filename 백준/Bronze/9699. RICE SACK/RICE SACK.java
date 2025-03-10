import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < 5; j++) {
                max = Math.max(max, sc.nextInt());
            }
            sb.append(String.format("Case #%d: %d\n", i + 1, max));
        }
        System.out.println(sb);
    }
}
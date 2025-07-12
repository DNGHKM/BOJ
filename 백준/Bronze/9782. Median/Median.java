import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = 1;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int[] arr = new int[n + 1];
            boolean odd = n % 2 != 0;

            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            if (odd) {
                sb.append(String.format("Case %d: %.1f\n", num, (double) arr[(n + 1) / 2]));
            } else {
                sb.append(String.format("Case %d: %.1f\n", num, (double) (arr[n / 2] + arr[n / 2 + 1]) / 2));
            }
            num++;
        }
        System.out.println(sb);
    }
}
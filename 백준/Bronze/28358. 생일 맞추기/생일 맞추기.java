import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[10];
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }

            int cnt = getCnt(arr, days);
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }

    private static int getCnt(int[] arr, int[] days) {
        int cnt = 0;
        for (int j = 1; j <= 12; j++) {
            if ((j < 10 && arr[j] == 1)) {
                continue;
            }

            if (j >= 10) {
                if (arr[j / 10] == 1 || arr[j % 10] == 1) {
                    continue;
                }
            }

            for (int k = 1; k <= days[j]; k++) {
                if ((k < 10 && arr[k] == 1)) {
                    continue;
                }

                if (k >= 10) {
                    if (arr[k / 10] == 1 || arr[k % 10] == 1) {
                        continue;
                    }
                }
                cnt++;
            }

        }
        return cnt;
    }
}
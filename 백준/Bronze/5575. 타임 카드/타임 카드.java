import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String[] split = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
            int[] ans = new int[3];
            ans[2] = arr[5] - arr[2];
            if (ans[2] < 0) {
                ans[2] += 60;
                arr[4]--;
            }
            ans[1] = arr[4] - arr[1];
            if (ans[1] < 0) {
                ans[1] += 60;
                arr[3]--;
            }
            ans[0] = arr[3] - arr[0];
            sb.append(String.format("%d %d %d\n", ans[0], ans[1], ans[2]));
        }
        System.out.print(sb);
    }
}

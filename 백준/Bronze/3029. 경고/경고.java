import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(":");
        String[] s2 = sc.nextLine().split(":");
        int[] t1 = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
        int[] t2 = Arrays.stream(s2).mapToInt(Integer::parseInt).toArray();
        int[] ans = new int[3];
        for (int i = 0; i < 3; i++) {
            ans[i] = t2[i] - t1[i];
        }
        for (int i = 2; i >= 0; i--) {
            if (ans[i] < 0) {
                if (i >= 1) {
                    ans[i] += 60;
                    ans[i - 1]--;
                } else {
                    ans[0] += 24;
                }
            }
        }
        long count = Arrays.stream(ans).filter(i -> i == 0).count();
        if (count == 3) {
            System.out.println("24:00:00");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(String.format("%02d", ans[i]));
            if (i != 2) sb.append(":");
        }

        System.out.println(sb);
    }
}
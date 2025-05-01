import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static int[] arr, ans;
    static int n, len;

    static boolean found = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        arr = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        len = (int) Math.log10(n) + 1;
        for (int i = len; i >= 1; i--) {
            if (found) {
                return;
            }
            ans = new int[i];
            makeNum(i, 0);
        }
    }

    private static void makeNum(int length, int idx) {
        if (found) {
            return;
        }
        if (idx == length) {
            int num = Integer.parseInt(Arrays.stream(ans)
                    .mapToObj(String::valueOf).collect(Collectors.joining()));
            if (num <= n) {
                found = true;
                System.out.println(num);
                return;
            }
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[idx] = arr[i];
            makeNum(length, idx + 1);
        }
    }
}
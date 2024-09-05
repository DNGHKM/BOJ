import java.util.*;

class Main {
    static int n, m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[m];
        back(arr, 0);
        System.out.println(sb);
    }

    private static void back(int[] arr, int len) {
        if (len == m) {
            Arrays.stream(arr).forEach(x -> sb.append(x + " "));
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            arr[len] = i;
            back(arr, len + 1);
        }
    }
}
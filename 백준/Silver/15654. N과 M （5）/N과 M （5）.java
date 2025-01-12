import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int m;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        int[] ans = new int[m];
        visited = new boolean[n];
        solution(0, ans, sb);
        System.out.println(sb);
    }

    private static void solution(int deep, int[] ans, StringBuilder sb) {
        if (deep == m) {
            Arrays.stream(ans).forEach(i -> sb.append(i + " "));
            sb.append("\n");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                ans[deep] = arr[i];
                solution(deep + 1, ans, sb);
                visited[i] = false;
            }
        }
    }
}

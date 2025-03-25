import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        int[] ans = new int[n + 1];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[b]++;
            list.get(a).add(b);
        }
        Queue<int[]> q = new LinkedList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                q.add(new int[]{i, 1});
                ans[i] = 1;
            }
        }

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            ans[poll[0]] = poll[1];
            for (int i : list.get(poll[0])) {
                arr[i]--;
                if (arr[i] == 0) {
                    q.add(new int[]{i, poll[1] + 1});
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Arrays.stream(ans).filter(i -> i > 0).forEach(i -> sb.append(i).append(" "));
        System.out.println(sb);
    }
}
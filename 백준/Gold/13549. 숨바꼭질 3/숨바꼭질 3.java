import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int[] time;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if (n >= k) {
            System.out.println(n - k);
            return;
        }
        time = new int[100_001];
        Arrays.fill(time, INF);
        time[n] = 0;
        dijk();
        System.out.println(time[k]);
    }

    private static void dijk() {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        pq.add(new int[]{n, 0});
        while (!pq.isEmpty()) {
            int cur = pq.poll()[0];
            for (int i : new int[]{cur + 1, cur - 1, cur * 2}) {
                if (i < time.length) {
                    if (i < 0) {
                        continue;
                    }
                    if (i == cur * 2 && time[i] > time[cur]) {
                        time[i] = time[cur];
                        pq.add(new int[]{i, time[i]});
                    } else if (time[i] > time[cur] + 1) {
                        time[i] = time[cur] + 1;
                        pq.add(new int[]{i, time[i]});
                    }
                }
            }
        }
    }
}
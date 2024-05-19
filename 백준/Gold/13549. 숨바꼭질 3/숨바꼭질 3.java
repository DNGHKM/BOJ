import java.io.*;
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

        time = new int[100001];
        Arrays.fill(time, INF);
        time[n] = 0;

        zeroOneBFS(k);
        System.out.println(time[k]);
    }

    private static void zeroOneBFS(int k) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[]{n, 0});

        while (!deque.isEmpty()) {
            int[] current = deque.poll();
            int cur = current[0];
            int curTime = current[1];

            if (cur == k) {
                break;
            }

            int next = cur * 2;
            if (next < time.length && time[next] > curTime) {
                time[next] = curTime;
                deque.addFirst(new int[]{next, curTime});
            }

            next = cur + 1;
            if (next < time.length && time[next] > curTime + 1) {
                time[next] = curTime + 1;
                deque.addLast(new int[]{next, curTime + 1});
            }

            next = cur - 1;
            if (next >= 0 && time[next] > curTime + 1) {
                time[next] = curTime + 1;
                deque.addLast(new int[]{next, curTime + 1});
            }
        }
    }
}
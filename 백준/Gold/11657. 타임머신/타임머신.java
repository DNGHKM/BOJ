import java.io.*;
import java.util.*;

public class Main {
    static final long INF = Long.MAX_VALUE;
    static ArrayList<int[]> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] dist = new long[n + 1];
        for (int i = 2; i < dist.length; i++) {
            dist[i] = INF;
        }
        list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            list.add(new int[]{s, e, d});
        }
        for (int i = 0; i < n - 1; i++) {
            bellman(dist);
        }
        long[] tmpDist = Arrays.copyOf(dist, dist.length);
        bellman(tmpDist);
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] != tmpDist[i]) {
                System.out.println(-1);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < dist.length; i++) {
            if (dist[i] != INF) {
                sb.append(dist[i]).append("\n");
            } else {
                sb.append(-1 + "\n");
            }
        }
        System.out.print(sb);
    }

    private static void bellman(long[] arr) {
        for (int[] ints : list) {
            if (arr[ints[0]] != INF) {
                if (arr[ints[0]] + ints[2] < arr[ints[1]]) {
                    arr[ints[1]] = arr[ints[0]] + ints[2];
                }
            }
        }
    }
}
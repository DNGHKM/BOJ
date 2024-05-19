import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int[] time;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        if (n >= k) {
            System.out.println(n - k);
            return;
        }
        time = new int[100_001];
        for (int i = 0; i < time.length; i++) {
            if (i != n) time[i] = INF;
        }
        int num = n;
        while (n != 0 && num < time.length) {
            time[num] = 0;
            num *= 2;
        }
        dijk();
        System.out.println(time[k]);
    }

    private static void dijk() {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        for (int i = 0; i < time.length; i++) {
            if(time[i]==0) pq.add(new int[]{i, 0});
        }
        while (!pq.isEmpty()) {
            int[] poll = pq.poll();
            int cur = poll[0];
            int plus = cur + 1;
            int minus = cur - 1;
            int multi = cur * 2;
            if (plus < time.length && time[plus] > time[cur] + 1) {
                time[plus] = time[cur] + 1;
                pq.add(new int[]{plus, time[plus]});
            }
            if (minus >= 0 && minus < time.length && time[minus] > time[cur] + 1) {
                time[minus] = time[cur] + 1;
                pq.add(new int[]{minus, time[minus]});
            }
            if (multi < time.length && time[multi] > time[cur]) {
                time[multi] = time[cur];
                pq.add(new int[]{multi, time[multi]});
            }
        }
    }
}

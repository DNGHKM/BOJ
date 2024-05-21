import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        parent = new int[n + 1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(find(a)!=find(b)){
                union(a,b);
                count++;
            }
        }
        PriorityQueue<double[]> pq = new PriorityQueue<>(Comparator.comparingDouble(o -> o[2]));
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int[] a = list.get(i);
                int[] b = list.get(j);
                double dx = Math.abs(a[0] - b[0]);
                double dy = Math.abs(a[1] - b[1]);
                pq.add(new double[]{i+1, j+1, Math.sqrt(dx * dx + dy * dy)});
            }
        }
        double dist = 0;
        while (count < n - 1) {
            double[] poll = pq.poll();
            int a = (int) poll[0];
            int b = (int) poll[1];
            if (find(a) != find(b)) {
                dist += poll[2];
                union(a, b);
                count++;
            }
        }
        double ans = (double) Math.round(dist * 100) / 100;
        System.out.printf("%.2f", ans);
    }

    private static void union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);
        if (parentA < parentB) {
            parent[parentB] = parentA;
        } else {
            parent[parentA] = parentB;
        }
    }

    private static int find(int a) {
        if (parent[a] == a) {
            return a;
        }
        return parent[a] = find(parent[a]);
    }
}
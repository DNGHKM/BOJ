import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        ArrayList<int[]> listX = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            listX.add(new int[]{i, x, y, z});
        }
        ArrayList<int[]> listY = (ArrayList<int[]>) listX.clone();
        ArrayList<int[]> listZ = (ArrayList<int[]>) listX.clone();
        listX.sort(Comparator.comparingInt(o -> o[1]));
        listY.sort(Comparator.comparingInt(o -> o[2]));
        listZ.sort(Comparator.comparingInt(o -> o[3]));

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
        for (int i = 0; i < n - 1; i++) {
            int[] x1 = listX.get(i + 1);
            int[] x2 = listX.get(i);
            int[] y1 = listY.get(i + 1);
            int[] y2 = listY.get(i);
            int[] z1 = listZ.get(i + 1);
            int[] z2 = listZ.get(i);
            pq.add(new int[]{x1[0], x2[0], Math.abs(x2[1] - x1[1])});
            pq.add(new int[]{y1[0], y2[0], Math.abs(y2[2] - y1[2])});
            pq.add(new int[]{z1[0], z2[0], Math.abs(z2[3] - z1[3])});
        }
        int count = 0;
        int len = 0;

        while (count<n-1) {
            int[] poll = pq.poll();
            int a = poll[0];
            int b = poll[1];
            int dist = poll[2];
            if (find(a) != find(b)) {
                count++;
                len += dist;
                union(a, b);
            }
        }
        System.out.println(len);
    }

    private static void union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);
        if (parentA < parentB) {
            parent[parentB] = parentA;
        }else{
            parent[parentA] = parentB;
        }
    }

    static int find(int a) {
        if (parent[a] == a) {
            return a;
        }
        return parent[a] = find(parent[a]);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    static int[] sum;
    static int[] familySize;
    static long curScore = 0;
    static long maxScore = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        parent = new int[n + 1];
        sum = new int[n + 1];
        familySize = new int[n + 1];
        Arrays.fill(familySize, 1);
        boolean[] shot = new boolean[n + 1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = arr[i];
        }
        int[] queryArr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = n - 1; i >= 0; i--) {
            queryArr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n - 1; i++) {
            int query = queryArr[i];
            curScore += sum[query];
            shot[query] = true;
            int queryParent = find(query);
            if (query > 1 && shot[query - 1]) {
                if (queryParent != find(query - 1)) {
                    union(query, query - 1);
                }
            }
            if (query < n && shot[query + 1]) {
                if (queryParent != find(query + 1)) {
                    union(query, query + 1);
                }
            }
            maxScore = Math.max(maxScore, curScore);
        }
        System.out.println(maxScore);
    }

    private static int find(Integer i) {
        if (parent[i] == i) {
            return i;
        }
        return parent[i] = find(parent[i]);
    }

    private static void union(Integer a, Integer b) {
        int parentA = find(a);
        int parentB = find(b);
        if(parentA==parentB) return;
        curScore -= (long) sum[parentA] * familySize[parentA];
        curScore -= (long) sum[parentB] * familySize[parentB];
        if (parentA < parentB) {
            parent[parentB] = parentA;
            familySize[parentA] += familySize[parentB];
            sum[parentA] += sum[parentB];
            curScore += (long) sum[parentA] * familySize[parentA];
        } else {
            parent[parentA] = parentB;
            familySize[parentB] += familySize[parentA];
            sum[parentB] += sum[parentA];
            curScore += (long) sum[parentB] * familySize[parentB];
        }
    }
}

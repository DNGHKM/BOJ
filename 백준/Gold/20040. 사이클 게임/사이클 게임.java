import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        int count = 0;
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[]{a, b});
        }
        for (int[] ints : list) {
            count++;
            if (find(ints[0]) == find(ints[1])) {
                System.out.print(count);
                return;
            }
            union(ints[0], ints[1]);
        }
        System.out.print(0);
    }

    static void union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);
        if (parentA < parentB) {
            arr[parentB] = parentA;
        } else {
            arr[parentA] = parentB;
        }
    }

    static int find(int i) {
        if (arr[i] == i) {
            return i;
        }
        return arr[i] = find(arr[i]);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (k == 1) {
            System.out.println("Yes");
            return;
        }

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        List<List<Integer>> groups = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            groups.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            groups.get(i % k).add(arr[i]);
        }


        for (List<Integer> group : groups) {
            Collections.sort(group);
        }
        
        int[] sorted = new int[n];
        int[] groupIdx = new int[k];
        for (int i = 0; i < n; i++) {
            int mod = i % k;
            sorted[i] = groups.get(mod).get(groupIdx[mod]++);
        }

        for (int i = 0; i < n; i++) {
            if (sorted[i] != i) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}

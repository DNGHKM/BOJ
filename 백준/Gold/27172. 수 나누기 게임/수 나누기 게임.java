import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 1_000_001;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] point = new int[num];
        boolean[] exist = new boolean[num];
        Arrays.stream(arr).forEach(i -> exist[i] = true);
        for (int k : arr) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 1; i < Math.sqrt(k) + 1; i++) {
                if (k % i == 0) {
                    set.add(i);
                    if(k!=1) {
                        set.add(k / i);
                    }
                }
            }
            for (Integer i : set) {
                if (exist[i]) {
                    point[i]++;
                    point[k]--;
                }
            }
        }
        Arrays.stream(arr).forEach(i -> System.out.print(point[i] + " "));
    }
}

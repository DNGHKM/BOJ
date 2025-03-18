import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<int[]> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }
        list.sort(((o1, o2) -> o2[1] - o1[1]));
        boolean[] linked = new boolean[n];
        for (int i = 0; i < Math.min(n, k); i++) {
            linked[list.get(i)[0]] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (linked[i]) {
                sb.append((i + 1)).append("\n");
            }
        }
        if (k > n) {
            sb.append((0 + "\n").repeat(k - n));
        }
        for (int i = 0; i < n; i++) {
            if(linked[i]){
                sb.append(i + 1).append("\n");
                continue;
            }
            sb.append(0 + "\n");
        }
        System.out.print(sb);
    }
}

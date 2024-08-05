import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        boolean[] cur = new boolean[7];
        cur[0] = true;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken()) % 7;
            if (num == 4) {
                System.out.println("YES");
                return;
            }
            if (num != 0) {
                q.add(num);
            }
        }
        while (!q.isEmpty()) {
            int poll = q.poll();
            boolean[] newCur = new boolean[7];
            for (int i = 0; i < 7; i++) {
                newCur[i] = cur[i];
            }
            for (int i = 0; i < 7; i++) {
                if (newCur[i]) {
                    cur[(i + poll) % 7] = true;
                }
            }
            cur[poll] = true;
            if (cur[4]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}

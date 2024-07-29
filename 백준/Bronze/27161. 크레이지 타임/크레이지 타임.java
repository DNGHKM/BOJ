import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cur = 0;
        boolean right = true;
        for (int i = 0; i < n; i++) {
            if (right) {
                cur++;
            } else {
                cur--;
            }
            if (cur == 13) {
                cur = 1;
            }
            if (cur == 0) {
                cur = 12;
            }
            StringTokenizer st = new StringTokenizer(br.readLine());
            String item = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            bw.write(cur + " ");
            if (cur == num && !item.equals("HOURGLASS")) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
            if (cur != num && item.equals("HOURGLASS")) {
                right = !right;
            }
        }
        bw.flush();
    }
}
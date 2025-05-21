import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        int q = Integer.parseInt(st.nextToken());
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int query = Integer.parseInt(st.nextToken());
            if (query == 3) {
                bw.write(n - set.size()+"\n");
                continue;
            }
            if (query == 1) {
                set.add(Integer.parseInt(st.nextToken()));
            }
            if (query == 2) {
                set.remove(Integer.parseInt(st.nextToken()));
            }
        }
        bw.flush();
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            HashMap<String, Integer> map = new HashMap<>();
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                String[] split = s.split(":");
                map.put(split[0], Integer.parseInt(split[1]));
            }
            st = new StringTokenizer(br.readLine(), "|");
            int totalMin = Integer.MAX_VALUE;
            while (st.hasMoreTokens()) {
                int max = Integer.MIN_VALUE;
                String s = st.nextToken();
                String[] split = s.split("&");
                for (String key : split) {
                    max = Math.max(max, map.get(key));
                }
                totalMin = Math.min(totalMin, max);
            }
           bw.write(totalMin+"\n");
        }
        bw.flush();
    }
}
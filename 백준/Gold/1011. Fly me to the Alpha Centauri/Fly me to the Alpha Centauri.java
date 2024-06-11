import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long dist = -(Long.parseLong(st.nextToken()) - Long.parseLong(st.nextToken()));
            long min = (long) Math.floor(Math.sqrt(dist)); //2
            int ans;
            if (Math.floor(Math.sqrt(dist)) < Math.sqrt(dist)) { //정확히 떨어지지 않는 예) 7
                ans = 2 * ((int) Math.floor(Math.sqrt(dist))); // 4
            } else {
                ans = 2 * ((int) Math.floor(Math.sqrt(dist))) - 1; // 3
            }
            long max = (int) Math.floor(Math.sqrt(dist)) + 1; //5
            long middle = (min * min + max * max) / 2; //20
            if (middle < dist) ans++;
            bw.write(ans + "\n");
        }
        bw.flush();
    }
}
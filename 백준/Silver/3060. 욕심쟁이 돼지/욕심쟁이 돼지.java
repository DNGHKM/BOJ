import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int ans = 1;
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 6; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            while (n >= sum) {
                sum *= 4;
                ans++;
            }
            bw.write(ans + "\n");
        }
        bw.flush();
    }
}
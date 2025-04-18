import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            ans += Math.min(n, Integer.parseInt(st.nextToken()));
        }
        System.out.println(ans);
    }
}

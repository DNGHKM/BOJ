import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Integer.parseInt(br.readLine());
            if (i >= 1) ans--;
        }
        System.out.println(ans);
    }
}
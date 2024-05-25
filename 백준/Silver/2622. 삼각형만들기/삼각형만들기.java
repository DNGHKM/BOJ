import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = i; j <= n - 2; j++) {
                int c = n - i - j;
                if (j > c) {
                    break;
                }
                if (c < i + j) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double ans = 1;
            for (int j = 0; j < 3; j++) {
                ans *= Double.parseDouble(st.nextToken());
            }
            sb.append(String.format("$%.2f\n", ans));
        }
        System.out.println(sb);
    }
}
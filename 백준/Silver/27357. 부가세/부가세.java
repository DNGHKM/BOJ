import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int total = Integer.parseInt(st.nextToken());
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Double.parseDouble(br.readLine());
            }
            boolean find = false;
            for (int j = 0; j <= 100000; j++) {
                double tax = sum * j / 100;
                if ((total <= sum + tax && sum + tax < total + 1) || (total <= sum + tax + 0.0099 && sum + tax + 0.0099 < total + 1)) {
                    if (!find) {
                        find = true;
                        bw.write(j + " ");
                    }
                } else {
                    if (find) {
                        bw.write(j - 1 + "\n");
                        break;
                    }
                }
            }
        }
        bw.flush();
    }
}
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = 0;
        int sumMax = 0;
        int max = -1000;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            num = Math.max(num + input, 0);
            if (sumMax < num) sumMax = num;
            if (max < input) max = input;
        }
        int ans = (sumMax == 0) ? max : sumMax;
        System.out.print(ans);
    }
}
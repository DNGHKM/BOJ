import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        int total = 0;
        for (int i = 0; i < n; i++) {
            int l = Integer.parseInt(st.nextToken());
            arr[i] = l;
            total += l;
        }

        int eat = 0;
        int daySum = 0;
        for (int food : arr) {
            if (food < x) {
                continue;
            }
            int day = food / x;
            daySum += day;

            int left = food % x;
            eat += (x * day) + Math.min((y - x) * day, left);
        }
        System.out.println(daySum + "\n" + (total - eat));
    }
}
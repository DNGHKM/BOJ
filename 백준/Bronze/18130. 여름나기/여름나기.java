import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long minNum = -1;
        long minPrice = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long price = Integer.parseInt(st.nextToken());
            long time = Integer.parseInt(st.nextToken());
            long pricePerTime = Integer.parseInt(st.nextToken());

            long sum = price;

            long digit = q / time;
            if (q % time == 0) {
                digit--;
            }
            sum += pricePerTime * (digit) * (digit + 1) / 2;

            if (sum < minPrice) {
                minNum = i + 1;
                minPrice = sum;
            }
        }
        System.out.println(minNum + " " + minPrice);
    }
}


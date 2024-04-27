import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long count = 0;

        int a = Integer.parseInt(br.readLine());
        long[] arrA = new long[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());
        long[] arrB = new long[b];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        Map<Long, Integer> mapA = new HashMap<>();
        for (int i = 0; i < arrA.length; i++) {
            long sum = 0;
            for (int j = i; j < arrA.length; j++) {
                sum += arrA[j];
                if (mapA.containsKey(sum)) {
                    mapA.put(sum, mapA.get(sum) + 1);
                } else {
                    mapA.put(sum, 1);
                }
            }
        }

        for (int i = 0; i < arrB.length; i++) {
            long sum = 0;
            for (int j = i; j < arrB.length; j++) {
                sum += arrB[j];
                if (mapA.containsKey(t - sum)) {
                    count += (long) mapA.get(t - sum);
                }
            }
        }

        System.out.print(count);
    }
}
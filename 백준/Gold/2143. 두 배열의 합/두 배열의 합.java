import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        long[] sumA = new long[a + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        fillSumArr(sumA, st);
        int b = Integer.parseInt(br.readLine());
        long[] sumB = new long[b + 1];
        st = new StringTokenizer(br.readLine());
        fillSumArr(sumB, st);
        TreeMap<Long, Long> mapA = new TreeMap<>();
        TreeMap<Long, Long> mapB = new TreeMap<>();
        fillMap(sumA, mapA);
        fillMap(sumB, mapB);
        long count = 0;
        for (Long i : mapA.keySet()) {
            long target = t - i;
            if(mapB.containsKey(target)){
                count += mapA.get(i) * mapB.get(target);
            }
        }
        System.out.println(count);
    }

    private static void fillSumArr(long[] sumArr, StringTokenizer st) {
        for (int i = 1; i < sumArr.length; i++) {
            sumArr[i] = sumArr[i - 1] + Long.parseLong(st.nextToken());
        }
    }

    private static void fillMap(long[] sumArr, Map<Long, Long> map) {
        for (int i = 0; i < sumArr.length - 1; i++) {
            for (int j = i + 1; j < sumArr.length; j++) {
                long num = sumArr[j] - sumArr[i];
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1L);
                }
            }
        }
    }
}
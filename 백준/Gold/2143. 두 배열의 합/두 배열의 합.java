import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long count = 0;
        
        int a = Integer.parseInt(br.readLine());
        long[] sumA = makeSumArr(a);
        
        int b = Integer.parseInt(br.readLine());
        long[] sumB = makeSumArr(b);
        
        Map<Long, Integer> mapA = fillMap(sumA);
        Map<Long, Integer> mapB = fillMap(sumB);
        
        
        for (Long i : mapA.keySet()) {
            long target = t - i;
            if (mapB.containsKey(target)) {
                count += (long) mapA.get(i) * mapB.get(target);
            }
        }
        System.out.print(count);
    }

    static long[] makeSumArr(int size) throws IOException {
        long[] sumArr = new long[size + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < sumArr.length; i++) {
            sumArr[i] = sumArr[i - 1] + Long.parseLong(st.nextToken());
        }
        return sumArr;
    }

    static Map<Long, Integer> fillMap(long[] sumArr) {
        TreeMap<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < sumArr.length - 1; i++) {
            for (int j = i + 1; j < sumArr.length; j++) {
                long num = sumArr[j] - sumArr[i];
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
        }
        return map;
    }
}
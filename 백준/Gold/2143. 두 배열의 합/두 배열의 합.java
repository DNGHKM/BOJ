import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long count = 0;

        int a = Integer.parseInt(br.readLine());
        long[] arrA = makeArr(a);

        int b = Integer.parseInt(br.readLine());
        long[] arrB = makeArr(b);

        Map<Long, Integer> mapA = fillMap(arrA);
        Map<Long, Integer> mapB = fillMap(arrB);


        for (Long i : mapA.keySet()) {
            long target = t - i;
            if (mapB.containsKey(target)) {
                count += (long) mapA.get(i) * mapB.get(target);
            }
        }
        System.out.print(count);
    }

    static long[] makeArr(int size) throws IOException {
        long[] arr = new long[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        return arr;
    }

    static Map<Long, Integer> fillMap(long[] arr) {
        TreeMap<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j = i; j < arr.length; j++) {
                long num = sum += arr[j];
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
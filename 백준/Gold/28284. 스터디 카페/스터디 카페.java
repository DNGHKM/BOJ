import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        long[] maxArr = new long[n + 1];
        long[] minArr = new long[n + 1];
        maxArr[1] = arr[arr.length - 1];
        minArr[1] = arr[1];
        for (int i = 1; i < arr.length; i++) {
            maxArr[i] = maxArr[i - 1] + arr[arr.length - i];
            minArr[i] = minArr[i - 1] + arr[i];
        }
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.add(new int[]{s, 0});
            list.add(new int[]{e + 1, 1});
        }
        list.sort(Comparator.comparingInt(o -> o[0]));
        long min = 0;
        long max = 0;
        long cur = 0;
        int count = 0;
        for (int[] ints : list) {
            long num = ints[0];
            min += (num - cur) * minArr[count];
            max += (num - cur) * maxArr[count];
            if (ints[1] == 1) {
                count--;
            } else {
                count++;
            }
            cur = num;
        }
        System.out.println(min + " " + max);
    }
}

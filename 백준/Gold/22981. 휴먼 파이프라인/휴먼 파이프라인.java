import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        long aNum = arr[0];
        long bNum = arr[1];
        long time = k / (aNum + bNum * (n - 1));
        if (time * (aNum + bNum * (n - 1)) < k) {
            time++;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            bNum = arr[i + 1];
            long cal = k / (aNum * (i + 1) + bNum * (n - 1 - i));
            if (cal * (aNum * (i + 1) + bNum * (n - 1 - i)) < k) {
                cal++;
            }
            time = Math.min(time, cal);
        }
        System.out.println(time);
    }
}
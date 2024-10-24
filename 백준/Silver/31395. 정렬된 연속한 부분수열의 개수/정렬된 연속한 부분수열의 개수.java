import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        int cnt = 1;
        while (idx < arr.length) {
            if (idx == arr.length - 1) {
                list.add(cnt);
                break;
            }
            if (arr[idx + 1] > arr[idx]) {
                cnt++;
            } else {
                list.add(cnt);
                cnt = 1;
            }
            idx++;
        }
        System.out.print(list.stream().mapToLong(i -> (long) (i + 1) * i / 2).sum());
    }
}
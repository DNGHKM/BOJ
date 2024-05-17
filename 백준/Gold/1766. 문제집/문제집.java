import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int before = Integer.parseInt(st.nextToken());
            int after = Integer.parseInt(st.nextToken());
            list.get(before).add(after);
            arr[after]++;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int index = 1;
        while (count < n) {
            if (arr[index] == 0) {
                sb.append(index+" ");
                count++;
                arr[index]--;
                for (Integer next : list.get(index)) {
                    arr[next]--;
                }
                index = 1;
                continue;
            }
            index++;
            if(index>n) index = 1;
        }
        System.out.println(sb);
    }
}
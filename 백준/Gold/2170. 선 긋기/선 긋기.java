import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[]{a, b});
        }
        list.sort((o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });
        long len = 0;
        int curL = list.get(0)[0];
        int curR = list.get(0)[1];
        for (int[] num : list) {
            if (num[0] > curR) {
                len += curR - curL;
                curL = num[0];
            }
            if (num[1] > curR) {
                curR = num[1];
            }
        }
        len += curR - curL;
        System.out.print(len);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    static char[][] arr;
    static int[][] group;
    static int ans;
    static int num;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        group = new int[n][m];
        ans = 0;
        num = 1;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (group[i][j] == 0) {
                    dfs(i, j);
                    num++;
                }
            }
        }
        System.out.print(ans);
    }

    static void dfs(int i, int j) {
        int[] cur = {i, j};
        while (group[cur[0]][cur[1]] == 0) {
            group[cur[0]][cur[1]] = num;
            char c = arr[cur[0]][cur[1]];
            if (c == 'D') {
                cur[0] += 1;
            } else if (c == 'U') {
                cur[0] -= 1;
            } else if (c == 'R') {
                cur[1] += 1;
            } else {
                cur[1] -= 1;
            }
        }
        if (group[cur[0]][cur[1]] == num) ans++;
    }
}

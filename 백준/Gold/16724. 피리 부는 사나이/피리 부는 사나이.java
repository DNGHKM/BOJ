import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        int[][] group = new int[n][m];
        int ans = 0;
        int num = 1;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (group[i][j] == 0) {
                    int[] cur = {i, j};
                    while (group[cur[0]][cur[1]] == 0) {
                        group[cur[0]][cur[1]] = num;
                        char c = arr[cur[0]][cur[1]];
                        if (c == 'D') {
                            cur[0]++;
                        } else if (c == 'U') {
                            cur[0]--;
                        } else if (c == 'R') {
                            cur[1]++;
                        } else {
                            cur[1]--;
                        }
                    }
                    if (group[cur[0]][cur[1]] == num) ans++;
                    num++;
                }
            }
        }
        System.out.print(ans);
    }
}

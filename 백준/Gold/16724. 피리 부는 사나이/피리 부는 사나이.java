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

    private static void dfs(int i, int j) {
        Stack<int[]> stack = new Stack<>();
        stack.add(new int[]{i, j});
        int[] end = new int[2];
        while (!stack.isEmpty()) {
            int[] pop = stack.pop();
            group[pop[0]][pop[1]] = num;
            int[] next = new int[]{0, 0};
            switch (arr[pop[0]][pop[1]]) {
                case 'D':
                    next = new int[]{pop[0] + 1, pop[1]};
                    break;
                case 'L':
                    next = new int[]{pop[0], pop[1] - 1};
                    break;
                case 'R':
                    next = new int[]{pop[0], pop[1] + 1};
                    break;
                case 'U':
                    next = new int[]{pop[0] - 1, pop[1]};
                    break;
            }
            if (group[next[0]][next[1]] == 0) {
                stack.add(new int[]{next[0], next[1]});
            }
            if (stack.isEmpty()) {
                end = new int[]{next[0], next[1]};
            }
        }
        if (group[end[0]][end[1]] == num) {
            ans++;
        }
    }
}

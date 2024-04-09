import java.io.*;
import java.util.*;

class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int r;
    static int c;
    static boolean[] visited;
    static char[][] arr;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        visited = new boolean[26];
        arr = new char[r][c];
        for (int i = 0; i < r; i++) {
            String input = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.charAt(j);
            }
        }
        visited[arr[0][0] - 'A'] = true;
        dfs(List.of(0, 0, 1));
        System.out.println(max);
    }

    static void dfs(List<Integer> ints) {
        if (ints.get(2) > max) max = ints.get(2);

        for (int i = 0; i < 4; i++) {
            int nextY = ints.get(0) + dy[i];
            int nextX = ints.get(1) + dx[i];
            if (rangeCheck(nextY, nextX) && !visited[arr[nextY][nextX] - 'A']) {
                visited[arr[nextY][nextX] - 'A'] = true;
                dfs(List.of(nextY, nextX, ints.get(2) + 1));
            }
        }
        visited[arr[ints.get(0)][ints.get(1)] - 'A'] = false;
    }

    private static boolean rangeCheck(int Y, int X) {
        return (0 <= Y && Y < r && 0 <= X && X < c);
    }
}
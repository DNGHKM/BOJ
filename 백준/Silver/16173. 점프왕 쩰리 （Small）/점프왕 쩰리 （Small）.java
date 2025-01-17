import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        boolean flag = false;
        boolean[][] visited = new boolean[n][n];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            int[] next1 = {cur[0] + arr[cur[0]][cur[1]], cur[1]};
            if (next(arr, visited, queue, next1)) return;
            int[] next2 = {cur[0], cur[1] + arr[cur[0]][cur[1]]};
            if (next(arr, visited, queue, next2)) return;
        }
        System.out.println("Hing");
    }

    private static boolean next(int[][] arr, boolean[][] visited, Queue<int[]> queue, int[] next1) {
        if (indexCheck(next1[0], next1[1])) {
            if (arr[next1[0]][next1[1]] == -1) {
                System.out.println("HaruHaru");
                return true;
            }
            if (!visited[next1[0]][next1[1]]) {
                visited[next1[0]][next1[1]] = true;
                queue.add(next1);

            }
        }
        return false;
    }

    private static boolean indexCheck(int y, int x) {
        return 0 <= y && y < n && 0 <= x && x < n;
    }
}

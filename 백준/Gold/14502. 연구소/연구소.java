import java.io.*;
import java.util.*;

public class Main {
    static int[] dy = {0, -1, 0, 1};
    static int[] dx = {1, 0, -1, 0};
    static int n, m;
    static int[][] arr, curArr;
    static ArrayList<int[]> safe, virus;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        curArr = new int[n][m];
        int ans = 0;
        virus = new ArrayList<>();
        safe = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int input = Integer.parseInt(st.nextToken());
                arr[i][j] = input;
                if (input == 2) {
                    virus.add(new int[]{i, j});
                } else if (input == 0) {
                    safe.add(new int[]{i, j});
                }
            }
        }
        for (int i = 0; i < safe.size() - 2; i++) {
            for (int j = i + 1; j < safe.size() - 1; j++) {
                for (int k = j + 1; k < safe.size(); k++) {
                    copyArr();
                    makeBlock(i, j, k);
                    for (int[] start : virus) {
                        bfs(start);
                    }
                    ans = Math.max(ans, countSafe());
                }
            }
        }
        System.out.println(ans);
    }

    private static int countSafe() {
        int count = 0;
        for (int i = 0; i < curArr.length; i++) {
            for (int j = 0; j < curArr[i].length; j++) {
                if (curArr[i][j] == 0) count++;
            }
        }
        return count;
    }

    private static void bfs(int[] start) {
        Queue<int[]> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextY = poll[0] + dy[i];
                int nextX = poll[1] + dx[i];
                if (rangeCheck(nextY, nextX) && curArr[nextY][nextX] == 0) {
                    q.add(new int[]{nextY, nextX});
                    curArr[nextY][nextX] = 2;
                }
            }
        }
    }

    private static boolean rangeCheck(int nextY, int nextX) {
        return 0 <= nextY && nextY < n && 0 <= nextX && nextX < m;
    }

    private static void copyArr() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                curArr[i][j] = arr[i][j];
            }
        }
    }

    private static void makeBlock(int i, int j, int k) {
        int[] first = safe.get(i);
        int[] second = safe.get(j);
        int[] third = safe.get(k);
        curArr[first[0]][first[1]] = 1;
        curArr[second[0]][second[1]] = 1;
        curArr[third[0]][third[1]] = 1;
    }
}
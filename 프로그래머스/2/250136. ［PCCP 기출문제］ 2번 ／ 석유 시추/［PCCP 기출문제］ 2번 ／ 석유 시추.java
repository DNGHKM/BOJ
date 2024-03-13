import java.util.*;
    
    
class Solution {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;
    static int lengthX;
    static int lengthY;
    
    public int solution(int[][] land) {
        lengthX = land[0].length;
        lengthY = land.length;
        visited = new boolean[lengthY][lengthX];
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < land[0].length; i++) {
            for (int j = 0; j < land.length; j++) {
                if (land[j][i] == 1 && !visited[j][i]) {
                    list.add(BFS(land, new int[]{j, i}, lengthX, lengthY));
                }
            }
        }
        int[] ans = new int[lengthX];
        for (int i = 0; i <lengthX; i++) {
            for (int[] ints : list) {
                if(ints[0]<=i&&i<=ints[1]) ans[i] += ints[2];
            }
        }
        return (Arrays.stream(ans).max().orElseThrow());
    }

    private static int[] BFS(int[][] land, int[] ints, int lengthX, int lengthY) {
        int num = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{ints[0], ints[1]});
        visited[ints[0]][ints[1]] = true;
        int left = lengthX;
        int right = 0;
        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            if(tmp[1]<left){
                left = tmp[1];
            }
            if(tmp[1]>right){
                right = tmp[1];
            }
            num++;
            for (int i = 0; i < 4; i++) {
                int[] next = new int[]{tmp[0] + dx[i], tmp[1] + dy[i]};
                if (rangeCheck(next, lengthX, lengthY)) {
                    if (!visited[next[0]][next[1]]&&land[next[0]][next[1]]==1) {
                        q.add(next);
                        visited[next[0]][next[1]] = true;
                    }
                }
            }
        }
        return new int[]{left,right,num};
    }
    private static boolean rangeCheck(int[] next, int lengthX, int lengthY) {
        return 0 <= next[0] && next[0] < lengthY && 0 <= next[1] && next[1] < lengthX;
    }
}
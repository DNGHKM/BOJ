class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        String color = board[h][w];
        int ans = 0;
        for (int i = 0; i < 4; i++) {
            if (0 <= w + dy[i] && w + dy[i] < board.length && 0 <= h + dx[i] && h + dx[i] < board.length) {
                if (board[h + dx[i]][w + dy[i]].equals(color)) ans++;
            }
        }
        return (ans);
    }
}
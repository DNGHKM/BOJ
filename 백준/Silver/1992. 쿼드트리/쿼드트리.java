import java.io.*;

public class Main {
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        quadTree(0, 0, n);
        System.out.println(sb);
    }

    static void quadTree(int y, int x, int size) {
        if (isSuccess(y, x, size)) {
            sb.append(arr[y][x]);
            return;
        }else{
            sb.append("(");
        }
        size /= 2;
        quadTree(y, x, size);
        quadTree(y, x + size, size);
        quadTree(y + size, x, size);
        quadTree(y + size, x + size, size);
        sb.append(")");
    }

    static boolean isSuccess(int y, int x, int size) {
        int start = arr[y][x];
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (arr[i][j] != start) {
                    return false;
                }
            }
        }
        return true;
    }
}
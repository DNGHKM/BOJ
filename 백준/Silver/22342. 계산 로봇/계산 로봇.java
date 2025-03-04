import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int m;
    static int n;

    static int[][] weight;
    static int[][] output;
    static int[][] save;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        weight = new int[m][n];
        output = new int[m][n];
        save = new int[m][n];

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                weight[i][j] = s.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i != 0) {
                    save[j][i] = maxNum(j, i);
                }
                output[j][i] = save[j][i] + weight[j][i];
            }
        }
        System.out.println(findMaxNum());
    }

    private static int findMaxNum() {
        int max = -1;
        for (int i = 0; i < m; i++) {
            max = Math.max(max, save[i][n - 1]);
        }
        return max;
    }

    private static int maxNum(int y, int x) {
        int max = -1;
        for (int i = y - 1; i <= y + 1; i++) {
            if (i < 0 || i > m - 1) {
                continue;
            }
            max = Math.max(max, output[i][x - 1]);
        }
        return max;
    }
}
import java.io.*;
import java.util.Arrays;

public class Main {
    static boolean[] visited = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[1_000_001];
        int cnt = 0;
        int num = 1;
        while (cnt < 1_000_000) {
            if (verify(num)) {
                arr[cnt] = num;
                cnt++;
            }
            num++;
        }
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                break;
            }
            bw.write(arr[input - 1] + "\n");
        }
        bw.flush();
    }

    private static boolean verify(int cur) {
        Arrays.fill(visited, false);
        while (cur > 0) {
            if (visited[cur%10]) return false;
            visited[cur%10] = true;
            cur /= 10;
        }
        return true;
    }
}
import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] step = new int[n+1];
        for (int i = 1; i < step.length; i++) {
            step[i] = Integer.parseInt(br.readLine());
        }
        int[][] ans = new int[n+1][2];
        if(n<3) {
            System.out.print(Arrays.stream(step).sum());
            return;
        }
        ans[1][0] = step[1];
        ans[2][0] = ans[1][0]+step[2];
        ans[2][1] = step[2];
        for (int i = 3; i <n+1; i++) {
            ans[i][0] = ans[i-1][1]+step[i];
            ans[i][1] = Math.max(ans[i-2][0],ans[i-2][1])+step[i];
        }
        System.out.print(Math.max(ans[n][0],ans[n][1]));
    }
}
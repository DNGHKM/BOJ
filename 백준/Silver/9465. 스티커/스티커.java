import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[2][n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <n; j++) {
                arr[0][j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <n; j++) {
                arr[1][j] = Integer.parseInt(st.nextToken());
            }
            if(n>1){
                arr[0][1] += arr[1][0];
                arr[1][1] += arr[0][0];
            }
            for (int j = 2; j <n; j++) {
                arr[0][j] += Math.max(Math.max(arr[0][j - 2], arr[1][j - 2]), arr[1][j - 1]);
                arr[1][j] += Math.max(Math.max(arr[0][j - 2], arr[1][j - 2]), arr[0][j - 1]);
            }
            bw.write(Math.max(arr[0][n-1],arr[1][n-1])+"\n");
        }
        bw.flush();
    }
}
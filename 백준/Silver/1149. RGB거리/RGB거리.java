import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] arr = new int[n][3];
        for (int i = 0; i < 3; i++) {
            arr[0][i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <3; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(j==0) {
                    arr[i][j] = num + Math.min(arr[i - 1][1], arr[i - 1][2]);
                } else if (j==1){
                    arr[i][j] = num + Math.min(arr[i - 1][0], arr[i - 1][2]);
                }else{
                    arr[i][j] = num + Math.min(arr[i - 1][0], arr[i - 1][1]);
                }
            }
        }
        System.out.print(Arrays.stream(arr[n - 1]).min().orElseThrow());
    }
}
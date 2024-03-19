import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[k + 1][n];
        int[][] item = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                item[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(i==0){
                    arr[i][j] = 0;
                }else if(j==0) {
                    if(item[j][0]<=i) {
                        arr[i][j] = item[j][1];
                    }
                }else{
                    if(item[j][0]<=i){
                        arr[i][j] = Math.max(item[j][1]+arr[i-item[j][0]][j-1],arr[i][j - 1]);
                    }else{
                        arr[i][j] = arr[i][j - 1];
                    }
                }
            }
        }
        System.out.println(arr[k][n-1]);
    }
}
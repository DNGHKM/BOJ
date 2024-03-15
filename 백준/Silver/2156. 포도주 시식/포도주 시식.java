import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[][] sum = new int[2][n];
        sum[0][0] = arr[0];
        if(n>2){
            sum[0][1] = sum[0][0] + arr[1];
            sum[1][1] = arr[1];
            sum[0][2] = sum[1][1]+arr[2];
            sum[1][2] = Math.max(sum[0][0],sum[1][0])+arr[2];
        } else if(n>1) {
            sum[0][1] = sum[0][0] + arr[1];
            sum[1][1] = arr[1];
        }
        for (int i = 3; i <n; i++) {
            sum[0][i]= sum[1][i-1]+arr[i];
            sum[1][i]= Math.max(Math.max(sum[0][i-2],sum[1][i-2]),Math.max(sum[0][i-3],sum[1][i-3]))+arr[i];
        }
        System.out.println(Arrays.stream(sum).flatMapToInt(i -> Arrays.stream(i)).max().getAsInt());
    }
}
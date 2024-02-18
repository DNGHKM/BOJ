import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            long earn = 0;
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int max = 0;
            for (int j = arr.length - 1; j >= 0; j--) {
                if(arr[j]>max){
                    max = arr[j];
                }else{
                    earn+=max-arr[j];
                }
            }
            sb.append(earn).append("\n");
        }
        System.out.println(sb);
    }
}
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = -1;
        int maxIdx = -1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            if(arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
        }
        double sum = 0;
        for (int i = 0; i <arr.length; i++) {
            if (i == maxIdx) {
                sum += arr[i];
            } else{
                sum += (double) arr[i] /2;
            }
        }
        System.out.println(sum);
    }
}
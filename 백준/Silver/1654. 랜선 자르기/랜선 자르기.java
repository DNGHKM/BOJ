import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];

        for (int i = 0; i <k; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        long max=0;
        for (int i = 0; i <k; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        long start = 1;
        long end = max+1;
        long mid;
        while(start<end){
            long count = 0;
            mid = (start+end)/2;
            for (int i = 0; i <k; i++) {
                count += arr[i] / mid;
            }
            if(count < n) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println(end-1);
    }
}
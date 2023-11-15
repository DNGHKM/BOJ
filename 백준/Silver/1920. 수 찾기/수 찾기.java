import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <m; i++) {
            int input = Integer.parseInt(st.nextToken());
            int start = 0;
            int fin = a.length-1;
            int mid = (start+fin)/2;
            while(start<=fin) {
                if (input > a[mid]) {
                    start = mid+1;
                    mid = (start+fin)/2;
                } else if(input<a[mid]){
                    fin = mid-1;
                    mid = (start+fin)/2;
                } else{

                    break;
                }
            }
            if(a[mid]==input){
                bw.write(1+"\n");
            }else{
                bw.write(0+"\n");
            }
        }
        bw.flush();
    }
}
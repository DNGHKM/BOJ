import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] land = new int[n*m];
        int k =0;
        int min = 256;
        int max = 0;
        for (int i = 0; i <n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <m; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                land[k++]= tmp;
                if(tmp<min) min=tmp;
                if(tmp>max) max=tmp;
            }
        }
        int minTime = Integer.MAX_VALUE;
        int finalLand = 0;
        for (int i = min; i <=max; i++) {
            int block = b;
            int time =0;
            for (int a : land) {
                if(i<a){
                    time+=2*(a-i);
                    block+=(a-i);
                }else if(i>a){
                    time += (i-a);
                    block-=(i-a);
                    }
                }
            if(block<0) {
                break;
            }else{
                if(time<=minTime){
                    minTime = time;
                    finalLand = i;
                }
            }
        }
        bw.write(minTime+" "+finalLand);
        bw.flush();
    }
}
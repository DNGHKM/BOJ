import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[] div = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < div.length; i++) {
            div[i] = Integer.parseInt(st.nextToken());
        }
        int[] density = new int[n];
        st = new StringTokenizer(br.readLine()); //2 1
        for (int i = 0; i < n; i++) {
            density[i] = Integer.parseInt(st.nextToken());
        }
        int num = 0;
        int[] denSum = new int[h + 1];
        denSum[0] = 0;
        for (int i = 1; i < denSum.length; i++) {
            if (div[num] < i) {
                num++;
            }
            denSum[i] = denSum[i - 1] + density[num];
        }
        int time = density[0] * w + denSum[y];
        for (int i = 0; i < div.length - 1; i++) {
            int cal = density[i + 1] * w + denSum[div[i]];
            if (div[i] < y) {
                cal += denSum[y]-denSum[div[i]];
            }else if(div[i] > y){
                cal += denSum[div[i]]-denSum[y];
            }
            time = Math.min(cal, time);
        }
        System.out.println(time);
    }
}
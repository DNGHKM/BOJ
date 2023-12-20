import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <t; i++) {
            st = new StringTokenizer(br.readLine());
            int[] s = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            int[] f = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            int n = Integer.parseInt(br.readLine());
            int count = n;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                if((dist(s, x, y)<r&&dist(f,x,y)<r)||(dist(s, x, y)>r&&dist(f,x,y)>r)){
                    count--;
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }

    private static double dist(int[] arr, int x, int y) {
        return Math.sqrt((x-arr[0])*(x-arr[0])+(y-arr[1])*(y-arr[1]));
    }
}

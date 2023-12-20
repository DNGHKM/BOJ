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
                if(free(s, f, x, y, r)){
                    count--;
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }

    private static boolean free(int[] arr, int[] arr2, int x, int y, int r) {
        double ds = Math.sqrt((x-arr[0])*(x-arr[0])+(y-arr[1])*(y-arr[1]));
        double df = Math.sqrt((x-arr2[0])*(x-arr2[0])+(y-arr2[1])*(y-arr2[1]));
        return (ds < r && df < r) || (ds > r && df > r);
    }
}

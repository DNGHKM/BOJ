import java.io.*;
import java.util.*;

class Main {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a>b-c){
                bw.write("do not advertise\n");
            }else if(a<b-c){
                bw.write("advertise\n");
            }else {
                bw.write("does not matter\n");
            }
        }
        bw.flush();
    }
}
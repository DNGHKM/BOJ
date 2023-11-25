import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[30][30];
        for (int i = 0; i <30; i++) {
            for (int j = 0; j <30; j++) {
                if(i==0&&j==0){
                    arr[i][j] = 0;
                }else if(i==0||j==0) {
                    arr[i][j] = 1;
                }else if(i==j){
                    arr[i][j] = 1;
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(arr[b][a]+"\n");
        }
        bw.flush();
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int x1;
    static int y1;
    static int x2;
    static int y2;
    static int[][] sumArr;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][n+1];
        sumArr = new int[n+1][n+1];
        for (int i = 1; i <arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <arr[i].length; j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
                if(j>1){
                    sumArr[i][j] = sumArr[i][j-1] + arr[i][j];
                } else{
                    sumArr[i][j] = arr[i][j];
                }
            }
        }
        for (int i = 0; i <m; i++) {
            st=new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            bw.write(cal(x1,y1,x2,y2)+"\n");
        }
        bw.flush();
}

    private static int cal(int x1, int y1, int x2, int y2) {
        result=0;
        for (int i = x1; i <=x2 ; i++) {
            result += sumArr[i][y2]-sumArr[i][y1-1];
        }
        return result;
    }
}
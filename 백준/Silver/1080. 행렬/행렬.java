import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        int[][] arrAns = new int[n][m];
        for (int i = 0; i <n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j)-'0';
            }
        }
        for (int i = 0; i <n; i++) {
            String str = br.readLine();
            for (int j = 0; j <m; j++) {
                arrAns[i][j] = str.charAt(j)-'0';
            }
        }
        int count = 0;
        for (int i = 0; i <=n-3; i++) {
            for (int j = 0; j <=m-3; j++) {
                if(arr[i][j]!=arrAns[i][j]){
                    flip(arr, i ,j);
                    count++;
                }
            }
        }
        boolean same = true;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                if(arr[i][j]!=arrAns[i][j]){
                    same = false;
                }
            }
        }
        if(same){
            System.out.println(count);
        }else {
            System.out.println(-1);
        }
    }

    private static void flip(int[][] arr, int i, int j) {
        for (int k = i; k <i+3; k++) {
            for (int l = j; l <j+3; l++) {
                if(arr[k][l]==0){
                    arr[k][l]=1;
                }else{
                    arr[k][l]=0;
                }
            }
        }
    }
}

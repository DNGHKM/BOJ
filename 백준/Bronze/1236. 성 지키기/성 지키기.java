import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        int ansA = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if(!str.contains("X")){
                ansA++;
            }
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        int ansB = 0;
        for (int i = 0; i <m; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if(arr[j][i]=='X'){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ansB++;
            }
        }
        System.out.println(Math.max(ansA,ansB));
    }
}
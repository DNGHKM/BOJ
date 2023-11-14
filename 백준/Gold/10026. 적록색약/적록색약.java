import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        char[][][] arr = new char[2][n][n];
        for (int i = 0; i <n; i++) {
            String input = br.readLine();
            for (int j = 0; j <n; j++) {
                arr[0][i][j] = input.charAt(j);
                if(input.charAt(j)=='R'){
                    arr[1][i][j]='G';
                }else{
                    arr[1][i][j]=input.charAt(j);
                }
            }
        }
        Queue<int[]> q1 = new LinkedList<>();
        int[] count = {0,0};
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <n; j++) {
                for (int k = 0; k <n; k++) {
                    if(arr[i][j][k]=='V'){
                        continue;
                    }
                    q1.add(new int[]{j,k});
                    char now = arr[i][j][k];
                    arr[i][j][k] = 'V';
                    while(!q1.isEmpty()) {
                        int[] tmp = q1.poll();
                        for (int l = 0; l <4; l++) {
                            int[] next = {tmp[0]+dx[l],tmp[1]+dy[l]};
                            if(rangeCheck(next[0],next[1])){
                                if(arr[i][next[0]][next[1]]=='V'){
                                    continue;
                                }
                                if(arr[i][next[0]][next[1]]==now){
                                    q1.add(new int[]{next[0], next[1]});
                                    arr[i][next[0]][next[1]]='V';
                                }
                            }
                        }
                    }
                    count[i]++;
                }
            }
        }
        System.out.println(count[0]+" "+count[1]);
    }

    private static boolean rangeCheck(int a, int b) {
        if(0<=a&&a<n&&0<=b&&b<n){
            return true;
        }else{
            return false;
        }
    }
}
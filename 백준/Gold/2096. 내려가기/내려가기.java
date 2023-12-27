import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int[][] maxArr;
    static int[][] minArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        maxArr = new int[n][3];
        minArr = new int[n][3];
        StringTokenizer st;
        for (int i = 0; i <n; i++) {
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j <3; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                maxArr[i][j] = tmp;
                minArr[i][j] = tmp;
            }
        }
        for (int i = 1; i <n; i++) {
            for (int j = 0; j <3; j++) {
                maxArr[i][j] += max(i,j);
                minArr[i][j] += min(i,j);
            }
        }
        int maxNum = 0;
        int minNum = 900_000;
        for (int i = 0; i <3; i++) {
            if (maxArr[n-1][i]>maxNum){
                maxNum = maxArr[n-1][i];
            }
            if (minArr[n-1][i]<minNum){
                minNum = minArr[n-1][i];
            }
        }
        System.out.println(maxNum+" "+minNum);
    }

    private static int max(int i, int j) {
        if(j==0){
            return Math.max(maxArr[i - 1][0], maxArr[i - 1][1]);
        } else if(j==1){
            return Math.max(Math.max(maxArr[i - 1][0], maxArr[i - 1][1]),maxArr[i-1][2]);
        } else{
            return Math.max(maxArr[i - 1][1], maxArr[i - 1][2]);
        }
    }

    private static int min(int i, int j){
        if(j==0){
            return Math.min(minArr[i - 1][0], minArr[i - 1][1]);
        } else if(j==1){
            return Math.min(Math.min(minArr[i - 1][0], minArr[i - 1][1]),minArr[i-1][2]);
        } else{
            return Math.min(minArr[i - 1][1], minArr[i - 1][2]);
        }
    }
}
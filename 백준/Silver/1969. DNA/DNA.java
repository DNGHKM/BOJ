import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[4][m];
        int length = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                char tmp = str.charAt(j);
                switch (tmp){
                    case 'A' : arr[0][j]++;
                        break;
                    case 'C' : arr[1][j]++;
                        break;
                    case 'G' : arr[2][j]++;
                        break;
                    case 'T' : arr[3][j]++;
                        break;
                }
            }
        }
        for (int i = 0; i <m; i++) {
            int max = 0;
            int maxIndex = 0;
            for (int j = 0; j <4 ; j++) {
                if(max<arr[j][i]){
                    max = arr[j][i];
                    maxIndex = j;
                }
            }
            length+=n-max;
            switch (maxIndex){
                case 0 : sb.append('A');
                    break;
                case 1 : sb.append('C');
                    break;
                case 2 : sb.append('G');
                    break;
                case 3 : sb.append('T');
                    break;
            }
        }
        sb.append("\n").append(length);
        System.out.println(sb);
    }
}
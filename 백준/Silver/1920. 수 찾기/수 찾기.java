import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int[] arrN = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrN);
        int m = Integer.parseInt(br.readLine());
        int[] arrM = new int[m];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i <m; i++) {
            arrM[i] = Integer.parseInt(st2.nextToken());
        }
        for (int i = 0; i < arrM.length; i++) {
            if(Arrays.binarySearch(arrN, arrM[i])>=0){
                sb.append(1+"\n");
            }else{
                sb.append(0+"\n");
            }
        }
        System.out.println(sb);
     }
}
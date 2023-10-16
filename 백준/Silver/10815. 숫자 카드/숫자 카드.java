import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrN = new int[n];
        StringTokenizer stN = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            arrN[i]=Integer.parseInt(stN.nextToken());
        }
        Arrays.sort(arrN);
        int m = Integer.parseInt(br.readLine());
        int[] arrM = new int[m];
        StringTokenizer stM = new StringTokenizer(br.readLine());
        for (int i = 0; i <m; i++) {
            arrM[i]=Integer.parseInt(stM.nextToken());
        }
        StringBuffer stb = new StringBuffer();
        for (int i = 0; i < arrM.length; i++) {
            int result = Arrays.binarySearch(arrN,arrM[i]);
            if(result>=0){
                stb.append(1).append(" ");
            }else{
                stb.append(0).append(" ");
            }
        }
        System.out.println(stb);
    }
}

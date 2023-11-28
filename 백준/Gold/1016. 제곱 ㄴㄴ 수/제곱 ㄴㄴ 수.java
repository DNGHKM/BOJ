import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        boolean[] result = new boolean[(int) (max-min+1)];
        Arrays.fill(result, true);
        long count = max-min+1;

        for (int a = 2; a<Math.sqrt(max)+1; a++) {
            long s = (long) a * a;
            long start;
            if(min%s == 0){
                start = min/s;
            } else{
                start = min/s+1;
            }
            for (long i = start; i*s<=max; i++) {
                result[(int) ((i*s)-min)] = false;
            }
        }
        for (int i = 0; i < result.length; i++) {
            if(!result[i]){
                count--;
            }
        }
        System.out.println(count);
    }
}
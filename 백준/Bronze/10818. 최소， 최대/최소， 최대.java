import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1_000_000;
        int min = 1_000_000;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num>max) max = num;
            if(num<min) min = num;
        }
        System.out.print(min+" "+max);
    }
}
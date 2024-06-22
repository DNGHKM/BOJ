import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int count = 0;
        int target = a;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num==target) {
                count++;
                target += d;
            }
        }
        System.out.println(count);
    }
}
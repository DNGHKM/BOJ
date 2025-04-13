import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Integer.parseInt(st.nextToken());
            long t = Integer.parseInt(st.nextToken());
            long c = Integer.parseInt(st.nextToken());
            if(!map.containsKey(t-x)){
                map.put(t - x, c);
            }else{
                map.put(t - x, c+map.get(t-x));
            }
        }
        long max = 0;
        for (Long i : map.keySet()) {
            max = Math.max(max, map.get(i));
        }
        System.out.println(max);
    }
}
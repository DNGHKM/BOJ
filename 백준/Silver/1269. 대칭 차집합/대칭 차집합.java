import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<Integer> hs = new HashSet<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            hs.add(Integer.parseInt(st2.nextToken()));
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i = 0; i <m; i++) {
            int num = Integer.parseInt(st3.nextToken());
            if(hs.contains(num)){
                hs.remove(num);
            } else{
                hs.add(num);
            }
        }
        System.out.println(hs.size());
    }
}
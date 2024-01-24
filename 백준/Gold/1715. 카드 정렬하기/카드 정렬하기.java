import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i <n; i++) {
            q.add(Integer.parseInt(br.readLine()));
        }
        int ans = 0;
        while(q.size()>1){
            int a = q.poll();
            int b = q.poll();
            ans += a+b;
            int sum = a+b;
            q.add(sum);
        }
        System.out.println(ans);
    }
}

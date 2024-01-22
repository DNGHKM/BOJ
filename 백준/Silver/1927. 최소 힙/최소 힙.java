import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i <n; i++) {
            int num = Integer.parseInt(br.readLine());
            int tmp;
            if(num==0){
                if(!q.isEmpty()) {
                    tmp = q.poll();
                    bw.write(tmp + "\n");
                }else{
                    bw.write(0+"\n");
                }
            }else{
                q.add(num);
            }
        }
        bw.flush();
    }
}
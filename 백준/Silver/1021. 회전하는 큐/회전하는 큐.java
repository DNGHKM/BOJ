import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Deque<Integer> dL = new LinkedList<>();
        Deque<Integer> dR = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for (int i = n; i > 0; i--) {
            dL.push(i);
            dR.push(i);
        }
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            while(dL.peek()!=num&&dR.peek()!=num){
                dL.addLast(dL.pollFirst());
                dR.addFirst(dR.pollLast());
                cnt++;
            }
            if(dL.peek()==num){
                dL.poll();
                dR = new LinkedList<>(dL);
            }else{
                dR.poll();
                dL = new LinkedList<>(dR);
            }
        }
        System.out.print(cnt);
    }
}
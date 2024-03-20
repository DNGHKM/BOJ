import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Deque<int[]> deque = new LinkedList<>();
        for (int i = 0; i <n; i++) {
            int[] input = {Integer.parseInt(st.nextToken()), i};
            if(deque.isEmpty()){
                deque.add(input);
            }else if(deque.peekLast()[0]>input[0]){
                while(!deque.isEmpty()&&deque.getLast()[0]>input[0]){
                    deque.pollLast();
                }
                deque.add(input);
            }else{
                deque.add(input);
            }
            bw.write(deque.peek()[0]+" ");
            if(deque.getFirst()[1]==i-l+1){
                deque.poll();
            }
        }
        bw.flush();
    }
}
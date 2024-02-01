import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            pq.add(Integer.parseInt(st.nextToken()));
        }
        int count = 1;
        while(!pq.isEmpty()){
            int tmp = pq.poll();
            while(!pq.isEmpty()){
                if(pq.peek()-tmp+1<=l){
                    pq.poll();
                }else{
                    count++;
                    tmp = pq.poll();
                }
            }
        }
        System.out.print(count);
    }
}
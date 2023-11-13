import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] visited;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <n+1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.get(s).add(e);
            list.get(e).add(s);
        }
        int[] count;
        int[] result = new int[n+1];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i <n+1; i++) {
            visited = new boolean[n+1];
            count = new int[n+1];
            count[i] = 0;
            q.add(i);
            visited[i]= true;
            while(!q.isEmpty()){
                int tmp = q.poll();
                for(int a : list.get(tmp)){
                    if(!visited[a]){
                        q.add(a);
                        visited[a] = true;
                        count[a]=count[tmp]+1;
                    }
                }
            }
            for (int a : count) {
                result[i] += a;
            }
        }
        int answer =1;
        int min = result[1];
        for (int i = 1; i <n+1; i++) {
            if(result[i]<min){
                min = result[i];
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
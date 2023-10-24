import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[n+1];
        ArrayList<ArrayList<Integer>> pc = new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            pc.add(new ArrayList<>());
        }
        for (int i = 0; i <m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            pc.get(s).add(e);
            pc.get(e).add(s);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        while(!stack.isEmpty()){
            for(int i : pc.get(stack.pop())){
                if(!visited[i]){
                    stack.push(i);
                    visited[i]=true;
                }
            }
        }
        int count=0;
        for (int i = 2; i < visited.length; i++) {
            if(visited[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
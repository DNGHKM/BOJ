import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count=0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[n+1];
        for (int i = 0; i <=n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i <m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.get(s).add(e);
            list.get(e).add(s);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <=n; i++) {
            if(!visited[i]) {
                stack.push(i);
                visited[i]=true;
                while(!stack.isEmpty()){
                    for (int j : list.get(stack.pop())) {
                        if(!visited[j]){
                            stack.push(j);
                            visited[j]=true;
                        }
                    }
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
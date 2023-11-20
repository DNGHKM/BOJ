import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <k; i++) {
            boolean result = true;
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            char[] team = new char[v+1];
            ArrayList<ArrayList<Integer>> list =new ArrayList<>();
            for (int j = 0; j < v+1; j++) {
                list.add(new ArrayList<>());
                team[j] = '0';
            }
            for (int j = 0; j <e; j++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                list.get(start).add(end);
                list.get(end).add(start);
            }
            Stack<Integer> stack = new Stack<>();
            for (int j = 1; j <list.size(); j++) {
                if(team[j]=='0') {
                    stack.push(j);
                    team[j]='A';
                    while (!stack.isEmpty()) {
                        int tmp = stack.pop();
                        for (int a : list.get(tmp)) {
                            if(team[tmp]==team[a]){
                                result =false;
                                break;
                            }else if (team[a]=='0') {
                                stack.push(a);
                                if (team[tmp] == 'A') {
                                    team[a] = 'B';
                                } else {
                                    team[a] = 'A';
                                }
                            }
                        }
                    }
                }
            }
            if(result){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
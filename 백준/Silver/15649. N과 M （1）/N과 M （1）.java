import java.util.*;

public class Main {
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        visited = new boolean[n];
        arr = new int[m];
        sb = new StringBuilder();
        print(n, m, 0);
        System.out.println(sb);
    }

    private static void print(int n, int m, int depth) {
        if(depth == m){
            Arrays.stream(arr).forEach(i -> sb.append(i).append(" "));
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i+1;
                print(n,m,depth+1);
                visited[i] = false;
            }
        }
    }
}
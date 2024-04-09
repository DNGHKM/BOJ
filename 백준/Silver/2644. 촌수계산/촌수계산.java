import java.util.*;

class Main {
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] visited;
    static int ans;
    static int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        visited = new boolean[n + 1];
        int a = sc.nextInt();
        b = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.get(s).add(e);
            list.get(e).add(s);
        }
        ans = -1;
        visited[a] = true;
        dfs(a, 0);
        System.out.print(ans);
    }

    private static void dfs(int a, int count) {
        if (a == b) {
            ans = count;
        }
        for (Integer i : list.get(a)) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i, count + 1);
            }
        }
    }
}
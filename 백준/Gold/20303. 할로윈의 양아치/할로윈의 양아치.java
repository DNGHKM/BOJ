import java.io.*;
import java.util.*;

public class Main {
    static int k;
    static int[] candies;
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        candies = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            candies[i] = Integer.parseInt(st.nextToken());
        }
        list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.get(s).add(e);
            list.get(e).add(s);
        }
        visited = new boolean[n + 1];
        ArrayList<int[]> bfsResult = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                int[] result = bfs(i);
                if (result[0] < k) {
                    bfsResult.add(new int[]{result[0], result[1]});
                }
            }
        }
        int[][] resultArr = new int[bfsResult.size()][2];
        for (int i = 0; i < bfsResult.size(); i++) {
            int[] ints = bfsResult.get(i);
            resultArr[i][0] = ints[0];
            resultArr[i][1] = ints[1];
        }
        int[][] arr = new int[k][resultArr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(i==0){
                    arr[i][j] = 0;
                }else if(j==0) {
                    if(resultArr[j][0]<=i) {
                        arr[i][j] = resultArr[j][1];
                    }
                }else{
                    if(resultArr[j][0]<=i){
                        arr[i][j] = Math.max(resultArr[j][1]+arr[i-resultArr[j][0]][j-1],arr[i][j - 1]);
                    }else{
                        arr[i][j] = arr[i][j - 1];
                    }
                }
            }
        }
        if(resultArr.length==0){
            System.out.println(0);
        }else {
            System.out.println(arr[k - 1][resultArr.length-1]);
        }
    }

    private static int[] bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int candyCount = candies[start];
        int peopleCount = 1;
        visited[start] = true;
        while (!q.isEmpty()) {
            int poll = q.poll();
            for (Integer num : list.get(poll)) {
                if (!visited[num]) {
                    q.add(num);
                    candyCount += candies[num];
                    peopleCount++;
                    visited[num] = true;
                }
            }
        }
        return new int[]{peopleCount, candyCount};
    }
}

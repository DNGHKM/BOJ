import java.io.*;
import java.util.*;

class Main {
    static ArrayList<Integer> list;
    static int[] bucket;
    static boolean[] visitedA;
    static boolean[] visitedB;
    static boolean[] visitedC;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bucket = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            bucket[i] = Integer.parseInt(st.nextToken());
        }
        list = new ArrayList<>();
        visitedA = new boolean[bucket[0] + 1];
        visitedB = new boolean[bucket[1] + 1];
        visitedC = new boolean[bucket[2] + 1];
        visitedA[0] = visitedB[0] = true;
        visitedC[bucket[2]] = true;
        dfs(new int[]{0, 0, bucket[2]});
        Collections.sort(list);
        list.forEach(i -> System.out.print(i + " "));
    }

    private static void dfs(int[] arr) {
        if (arr[0] == 0) {
            list.add(arr[2]);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == i) {
                    continue;
                }
                if (arr[i] > 0 && bucket[j] > arr[j]) {
                    int filling = Math.min(arr[i], bucket[j] - arr[j]);
                    int[] next = {arr[0], arr[1], arr[2]};
                    next[j] += filling;
                    next[i] -= filling;
                    if (!visitedA[next[0]] || !visitedB[next[1]] || !visitedC[next[2]]) {
                        visitedA[next[0]] = visitedB[next[1]] = visitedC[next[2]] = true;
                        dfs(next);
                    }
                }
            }
        }
    }
}
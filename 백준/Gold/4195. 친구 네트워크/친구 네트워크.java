import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    static int[] count;
    static HashMap<String, Integer> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            parent = new int[n * 2];
            count = new int[n * 2];
            for (int j = 0; j < parent.length; j++) {
                parent[j] = j;
                count[j] = 1;
            }
            map = new HashMap<>();
            int index = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s1 = st.nextToken();
                String s2 = st.nextToken();
                if (!map.containsKey(s1)) {
                    map.put(s1, index++);
                }
                if (!map.containsKey(s2)) {
                    map.put(s2, index++);
                }
                bw.write(union(map.get(s1), map.get(s2)) + "\n");
            }
        }
        bw.flush();
    }

    private static int union(int a, int b) {
        int parentS1 = find(a);
        int parentS2 = find(b);
        if (parentS1 < parentS2) {
            parent[parentS2] = parentS1;
            count[parentS1] += count[parentS2];
            return count[parentS1];
        } else if(parentS2<parentS1){
            parent[parentS1] = parentS2;
            count[parentS2] += count[parentS1];
            return count[parentS2];
        }else{
            return count[parentS1];
        }
    }

    private static int find(int num) {
        if (num == parent[num]) {
            return num;
        }
        return parent[num] = find(parent[num]);
    }
}
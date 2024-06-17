import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'Y') {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, find(i));
        }
        System.out.println(max);
    }

    private static int find(int start) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list.get(start)) {
            set.add(i);
            for (Integer j : list.get(i)) {
                if (j != start) set.add(j);
            }
        }
        return set.size();
    }
}
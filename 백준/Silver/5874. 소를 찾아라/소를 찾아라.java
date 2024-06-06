import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<Integer> front = new ArrayList<>();
        ArrayList<Integer> rear = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(i, i + 2);
            if (sub.equals("((")) {
                rear.add(i);
            } else if (sub.equals("))")) {
                front.add(i);
            }
        }
        int ans = 0;
        for (Integer i : front) {
            int count = 0;
            for (Integer j : rear) {
                if (i > j) {
                    count++;
                } else {
                    break;
                }
            }
            ans += count;
        }
        System.out.println(ans);
    }
}
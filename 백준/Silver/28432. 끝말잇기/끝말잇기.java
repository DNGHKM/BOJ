import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        Set<String> set = new HashSet<>();

        Character start = null;
        Character end = null;

        int idx = -1;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals("?")) {
                idx = i;
            }
            arr[i] = s;
            set.add(s);
        }

        if (idx != 0) {
            start = arr[idx - 1].charAt(arr[idx - 1].length() - 1);
        }

        if (idx != n - 1) {
            end = arr[idx + 1].charAt(0);
        }

        int m = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (set.contains(s)) {
                continue;
            }
            if (start != null && s.charAt(0) != start) {
                continue;
            }
            if (end != null && s.charAt(s.length() - 1) != end) {
                continue;
            }

            System.out.println(s);
            return;
        }
    }
}
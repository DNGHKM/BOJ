import java.io.*;
import java.util.TreeSet;

class Main {
    static BufferedWriter bw;
    static TreeSet<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            find(br.readLine());
        }
        bw.flush();
    }

    private static void find(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        backTrack(s, sb, count);
        
        for (String str : set) {
            try {
                bw.write(str + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        set.clear();
    }

    private static void backTrack(String s, StringBuilder sb, int[] count) {
        if (sb.length() == s.length()) {
            set.add(sb.toString());
            return;
        }
        for (int j = 0; j < 26; j++) {
            if (count[j] > 0) {
                count[j]--;
                sb.append((char) ('a' + j));
                backTrack(s, sb, count);
                sb.deleteCharAt(sb.length() - 1);
                count[j]++;
            }
        }
    }
}
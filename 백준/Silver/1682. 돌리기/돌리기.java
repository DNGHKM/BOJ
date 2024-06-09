import java.io.*;
import java.util.*;

public class Main {
    static int count;
    static String target;
    static StringBuilder sb;
    static HashSet<String> set;
    static int[][] changes = {{7, 6, 5, 4, 3, 2, 1, 0},
            {3, 0, 1, 2, 5, 6, 7, 4},
            {0, 2, 5, 3, 4, 6, 1, 7},
            {4, 1, 2, 3, 0, 5, 6, 7}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String start = "12345678";
        StringTokenizer st = new StringTokenizer(br.readLine());
        set = new HashSet<>();
        sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(st.nextToken());
        }
        target = sb.toString();
        sb = new StringBuilder();
        bfs(start);
        System.out.println(count);
    }

    private static void bfs(String start) {
        Queue<Str> q = new LinkedList<>();
        q.add(new Str(start, 0));
        while (!q.isEmpty()) {
            Str poll = q.poll();
            if (check(poll)) {
                count = poll.count;
                break;
            }
            count++;
            for (int i = 0; i < 4; i++) {
                String c = change(i, poll.s);
                if (!set.contains(c)) {
                    set.add(c);
                    q.add(new Str(c, poll.count+1));
                }
            }
        }
    }

    private static String change(int num, String poll) {
        sb = new StringBuilder("00000000");
        for (int i = 0; i < poll.length(); i++) {
            sb.replace(i, i + 1, String.valueOf(poll.charAt(changes[num][i])));
        }
        return sb.toString();
    }

    private static boolean check(Str poll) {
        for (int i = 0; i < 8; i++) {
            if (poll.s.charAt(i) != target.charAt(i)) return false;
        }
        return true;
    }
}

class Str {
    String s;
    int count;

    public Str(String s, int count) {
        this.s = s;
        this.count = count;
    }
}
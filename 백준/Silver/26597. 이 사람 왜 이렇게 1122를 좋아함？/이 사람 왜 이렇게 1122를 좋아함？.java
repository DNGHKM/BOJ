import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long left = (long) -Math.pow(10, 18);
        long right = (long) Math.pow(10, 18);
        boolean paradox = false;
        int pLine = -1;
        boolean find = false;
        int findLine = -1;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long num = Long.parseLong(st.nextToken());
            String s = st.nextToken();
            if (s.equals("^")) {
                left = Math.max(left, num + 1);
            }
            if (s.equals("v")) {
                right = Math.min(right, num - 1);
            }
            if (right == left) {
                find = true;
                if (findLine == -1) {
                    findLine = i + 1;
                }
            }
            if (left > right) {
                paradox = true;
                if (pLine == -1) {
                    pLine = i + 1;
                }
            }
        }
        if (paradox) {
            System.out.println("Paradox!\n" + pLine);
            return;
        }

        if (find) {
            System.out.println("I got it!\n" + findLine);
            return;
        }

        System.out.println("Hmm...");
    }
}
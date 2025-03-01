import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Serial> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Serial(br.readLine()));
        }
        Collections.sort(list);
        list.forEach(s -> System.out.println(s.code));
    }

    static class Serial implements Comparable {
        String code;

        public Serial(String code) {
            this.code = code;
        }

        @Override
        public int compareTo(Object o) {
            String b = ((Serial) o).code;
            if (code.length() != b.length()) {
                return code.length() - b.length();
            }
            int sumA = 0;
            int sumB = 0;
            for (int i = 0; i < code.length(); i++) {
                char c = code.charAt(i);
                if ('0' <= c && c <= '9') {
                    sumA += code.charAt(i) - '0';
                }
            }
            for (int i = 0; i < b.length(); i++) {
                char c = b.charAt(i);
                if ('0' <= c && c <= '9') {
                    sumB += b.charAt(i) - '0';
                }
            }
            if (sumA != sumB) {
                return sumA - sumB;
            }
            return code.compareTo(b);
        }
    }
}
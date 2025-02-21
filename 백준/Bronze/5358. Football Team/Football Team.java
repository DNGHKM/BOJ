import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'i') {
                    sb.append('e');
                    continue;
                }
                if (s.charAt(i) == 'e') {
                    sb.append('i');
                    continue;
                }
                if (s.charAt(i) == 'I') {
                    sb.append('E');
                    continue;
                }
                if (s.charAt(i) == 'E') {
                    sb.append('I');
                    continue;
                }
                sb.append(s.charAt(i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
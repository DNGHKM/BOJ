import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringBuilder tmp = new StringBuilder();
            String s = br.readLine();
            for (int j = s.length() - 1; j >= 0; j--) {
                tmp.append(s.charAt(j));
            }
            String s2 = tmp.toString();

            for (int j = 0; j < s.length(); j++) {
                if (s.substring(j)
                        .equals(s2.substring(0, s.length() - j))) {
                    sb.append(s + s2.substring(s2.length() - j) + "\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}

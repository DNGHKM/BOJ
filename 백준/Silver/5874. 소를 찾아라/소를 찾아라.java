import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(i, i + 2);
            if (sub.equals("((")) {
                count++;
            } else if (sub.equals("))")) {
                ans += count;
            }
        }
        System.out.println(ans);
    }
}
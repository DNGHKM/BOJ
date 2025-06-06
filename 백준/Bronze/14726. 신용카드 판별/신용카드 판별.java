import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            if (check(br.readLine())) {
                bw.write("T\n");
                continue;
            }
            bw.write("F\n");
        }
        bw.flush();
    }

    private static boolean check(String s) {
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = s.charAt(i) - '0';
            if (i % 2 == 0) {
                num *= 2;
                if (num >= 10) {
                    num = num % 10 + 1;
                }
            }
            sum += num;
        }
        return sum % 10 == 0;
    }
}

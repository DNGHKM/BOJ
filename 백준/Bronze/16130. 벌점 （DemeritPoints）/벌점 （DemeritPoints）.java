import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int sum = 0;
            int cnt = 0;
            int tmp = 0;
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                sum += c < 'A' ? c - '0' : c - 'A' + 10;
                if (tmp / 10 < sum / 10) {
                    tmp = sum;
                    if (tmp / 10 >= 4) {
                        flag = true;
                        break;
                    }
                    cnt += sum / 10;
                }
            }
            bw.write(cnt + "");
            if (flag) {
                if (tmp / 10 == 4) {
                    bw.write("(weapon)");
                } else {
                    bw.write("(09)");
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
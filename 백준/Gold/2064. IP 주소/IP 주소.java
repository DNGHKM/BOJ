import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] ips = new String[n];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] split = input.split("\\.");
            StringBuilder sb = new StringBuilder();
            for (String s : split) {
                int num = Integer.parseInt(s);
                String binary = Integer.toBinaryString(num);
                sb.append(String.format("%8s", binary).replace(" ", "0"));
            }
            ips[i] = sb.toString();
        }
        StringBuilder maskBuilder = new StringBuilder();
        boolean same = true;
        for (int i = 0; i < 32; i++) {
            int num = ips[0].charAt(i);
            for (int j = 1; j < ips.length; j++) {
                if (ips[j].charAt(i) != num) {
                    same = false;
                    break;
                }
            }
            if (same) {
                maskBuilder.append("1");
            } else {
                maskBuilder.append("0");
            }
        }
        String mask = maskBuilder.toString();
        String[] maskBinary = new String[4];
        String[] ipFirstBinary = new String[4];
        int[] netWork = new int[4];
        for (int i = 0; i < 4; i++) {
            maskBinary[i] = (mask.substring(i * 8, (i + 1) * 8));
            ipFirstBinary[i] = (ips[0].substring(i * 8, (i + 1) * 8));
        }
        for (int i = 0; i < 4; i++) {
            netWork[i] = Integer.parseInt(maskBinary[i], 2) & Integer.parseInt(ipFirstBinary[i], 2);
        }
        for (int i = 0; i < 4; i++) {
            bw.write(netWork[i] + "");
            if (i < 3) bw.write(".");
        }
        bw.write("\n");
        for (int i = 0; i < 4; i++) {
            bw.write(Integer.parseInt(maskBinary[i], 2) + "");
            if (i < 3) bw.write(".");
        }
        bw.flush();

    }
}
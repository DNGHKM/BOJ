import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        //회문 = 0, 유사회문 = 1, 그 외 = 2
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            bw.write(Math.min(checkOne(s),checkTwo(s)) + "\n");
        }
        bw.flush();
    }

    private static int checkOne(String s) {
        int left = 0;
        int right = s.length() - 1;
        int status = 0;
        boolean skip = false;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else if (right - left == 1 && !skip) {
                status = 1;
                break;
            } else if (s.charAt(left) == s.charAt(right - 1) && s.charAt(left + 1) == s.charAt(right - 2) && !skip) {
                skip = true;
                status = 1;
                right--;
            } else if (s.charAt(left + 1) == s.charAt(right) && s.charAt(left + 2) == s.charAt(right - 1) && !skip) {
                skip = true;
                status = 1;
                left++;
            } else {
                status = 2;
                break;
            }
        }
        return status;
    }

    private static int checkTwo(String s) {
        int left = 0;
        int right = s.length() - 1;
        int status = 0;
        boolean skip = false;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else if (right - left == 1 && !skip) {
                status = 1;
                break;
            } else if (s.charAt(left + 1) == s.charAt(right) && s.charAt(left + 2) == s.charAt(right - 1) && !skip) {
                skip = true;
                status = 1;
                left++;
            } else if (s.charAt(left) == s.charAt(right - 1) && s.charAt(left + 1) == s.charAt(right - 2) && !skip) {
                skip = true;
                status = 1;
                right--;
            } else {
                status = 2;
                break;
            }
        }
        return status;
    }
}
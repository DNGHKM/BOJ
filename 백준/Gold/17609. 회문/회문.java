import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            bw.write(Math.min(check(s, 0, 1), check(s, 1, 0)) + "\n");
        }
        bw.flush();
    }

    private static int check(String s, int a, int b) {
        int left = 0;
        int right = s.length() - 1;
        int status = 0;
        boolean skip = false;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else if (s.charAt(left + a) == s.charAt(right - b) && !skip) {
                skip = true;
                status = 1;
                if(b==1){
                    right--;
                }else {
                    left++;
                }
            } else {
                status = 2;
                break;
            }
        }
        return status;
    }
}
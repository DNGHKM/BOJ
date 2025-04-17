import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String birthday = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr);
        String ans = "";
        int max = -1;
        for (String s : arr) {
            int num = score(s, birthday);
            if (max < num) {
                ans = s;
                max = num;
            }
        }
        System.out.println(ans);
    }

    private static int score(String s, String birthday) {
        int y = 0;
        for (int i = 0; i < 4; i++) {
            int num = s.charAt(i) - birthday.charAt(i);
            y += num * num;
        }
        int m = 0;
        for (int i = 4; i < 6; i++) {
            int num = s.charAt(i) - birthday.charAt(i);
            m += num * num;
        }
        int d = 0;
        for (int i = 6; i < 8; i++) {
            int num = s.charAt(i) - birthday.charAt(i);
            d += num * num;
        }
        return y * m * d;
    }
}
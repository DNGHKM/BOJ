import java.io.*;
import java.util.*;

public class Main {
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        arr = new long[79];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean found = false;
            long k = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            if (k == 1) {
                if (findOne(x)) found = true;
            } else if (k == 2) {
                if (findTwo(x)) found = true;
            } else {
                if (findThree(x)) found = true;
            }
            if (found) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }

    private static boolean findThree(long x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean findTwo(long x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean findOne(long x) {
        for (long l : arr) {
            if (l == x) {
                return true;
            }
        }
        return false;
    }
}
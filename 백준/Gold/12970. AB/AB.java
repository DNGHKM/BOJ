import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int aNum = 0;
        int bNum = 0;
        int max = (n / 2) * (n - n / 2);
        if (k > max) {
            System.out.println(-1);
            return;
        }
        char[] arr = new char[n];
        for (int i = 0; i < n / 2; i++) {
            arr[i] = 'A';
        }
        for (int i = n / 2; i < arr.length; i++) {
            arr[i] = 'B';
        }
        int target = max - k;
        int lastAIndex = n / 2 - 1;
        int curIndex = lastAIndex;
        while (target > 0) {
            arr[curIndex] = 'B';
            arr[curIndex + 1] = 'A';
            curIndex++;
            if(curIndex==arr.length-1||arr[curIndex+1]=='A'){
                lastAIndex--;
                curIndex = lastAIndex;
            }
            target--;
        }
        for (char c : arr) {
            bw.write(c);
        }
        bw.flush();
    }
}

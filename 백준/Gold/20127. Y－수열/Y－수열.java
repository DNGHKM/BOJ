import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int asc = 1;
        int ascCnt = 1;
        int desc = 1;
        int descCnt = 1;
        int cur = Integer.parseInt(st.nextToken());
        int start = cur;
        int fin = cur;
        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (i == n - 1) fin = num;
            if (cur < num) {
                if (asc == 1) {
                    ascCnt++;
                }
                desc--;
            } else if (cur > num) {
                if (desc == 1) {
                    descCnt++;
                }
                asc--;
            } else {
                if (desc == 1) {
                    descCnt++;
                }
                if (asc == 1) {
                    ascCnt++;
                }
            }
            cur = num;
        }
        if (asc == 1 || desc == 1) {
            System.out.println(0);
            return;
        }
        boolean ascResult = false;
        boolean descResult = false;
        if (asc == 0 && start >= fin) {
            ascResult = true;
        }
        if (desc == 0 && start <= fin) {
            descResult = true;
        }
        if(ascResult && descResult) {
            System.out.println(Math.min(ascCnt, descCnt));
            return;
        }
        if(ascResult){
            System.out.println(ascCnt);
            return;
        }
        if(descResult){
            System.out.println(descCnt);
            return;
        }
        System.out.println(-1);
    }
}

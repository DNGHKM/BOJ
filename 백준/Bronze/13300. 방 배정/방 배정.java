import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] boys = new int[6];
        int[] girls = new int[6];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            if(gender==0){
                girls[grade - 1]++;
                continue;
            }
            boys[grade-1]++;
        }
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            cnt += boys[i] % k == 0 ? boys[i] / k : boys[i] / k + 1;
            cnt += girls[i] % k == 0 ? girls[i] / k : girls[i] / k + 1;
        }
        System.out.println(cnt);
    }
}
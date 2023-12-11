import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 0;
        int man = 0;
        for (int j = 0; j <4; j++) {
            min+=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j <4; j++) {
            man+=Integer.parseInt(st.nextToken());
        }
        System.out.println(Math.max(min,man));
    }
}
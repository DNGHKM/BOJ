import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10003];
        // 시작 1
        // 중간 2
        // 끝 3
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (arr[a] == 3) arr[a] = 2;
            if (arr[b] == 1) arr[b] = 2;
            if (arr[a] != 2) arr[a] = 1;
            if (arr[b] != 2) arr[b] = 3;
            for (int j = a + 1; j < b; j++) {
                arr[j] = 2;
            }
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == 1 && arr[i + 1] == 1) arr[i] = 2;
        }
        int cnt = 0;
        int start = 0;
        int end;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                start = i;
            }
            if (arr[i] == 3) {
                end = i;
                cnt += end - start;
            }
        }
        System.out.println(cnt);
    }
}
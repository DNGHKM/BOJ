import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] one = new int[20];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i : arr) {
            int index = 0;
            while(i > 0) {
                if (i % 2 != 0) {
                    one[index]++;
                }
                index++;
                i/=2;
            }
        }
        int binaryNum = 1;
        long ans = 0;
        for (int i : one) {
            ans += (long)i*(n-i) * binaryNum;
            binaryNum *= 2;
        }
        System.out.print(ans);
    }
}
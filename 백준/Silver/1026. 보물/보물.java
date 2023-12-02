import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        int result = 0;
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i <n ; i++) {
            a[i] = Integer.parseInt(st1.nextToken());
            b[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int bIndex = b.length-1;
        for (int num : a) {
            result+=num*b[bIndex];
            bIndex--;
        }
        System.out.println(result);
    }
}
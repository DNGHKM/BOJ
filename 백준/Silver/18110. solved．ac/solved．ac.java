import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int cut = (int) Math.round(n*0.15);
        int sum = 0;
        for (int i = cut; i <arr.length-cut; i++) {
            sum+=arr[i];
        }
        System.out.println((int) Math.round((double) sum /(n-cut*2)));
    }
}
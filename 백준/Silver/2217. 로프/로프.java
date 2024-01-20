import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int[] result = new int[n];
        int num = n;
        for (int i = 0; i <n; i++) {
            result[i] = num*arr[i];
            num--;
        }
        int max = 0;
        for (int i : result) {
            if(i>max) max = i;
        }
        System.out.println(max);
    }
}
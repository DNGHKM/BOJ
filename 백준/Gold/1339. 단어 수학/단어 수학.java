import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        for (int i = 0; i <n; i++) {
            String s = br.readLine();
            int num = 1;
            for (int j = s.length()-1; j >=0; j--) {
                arr[s.charAt(j)-'A']+=num;
                num*=10;
            }
        }
        Arrays.sort(arr);
        int ans = 0;
        int num = 9;
        for (int i = arr.length-1; i>=0 ; i--) {
            ans+=arr[i]*num;
            num--;
        }
        System.out.println(ans);
    }
}
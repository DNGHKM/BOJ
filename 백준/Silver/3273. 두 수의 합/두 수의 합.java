import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int x = Integer.parseInt(br.readLine());
        int left = 0;
        int right = arr.length-1;
        int count = 0;
        while(left!=right){
            if(arr[left]+arr[right]==x){
                count++;
                right--;
            } else if(arr[left]+arr[right]>x){
                right--;
            } else {
                left++;
            }
        }
        System.out.println(count);
    }
}
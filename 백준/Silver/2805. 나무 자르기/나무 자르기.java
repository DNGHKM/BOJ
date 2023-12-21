import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int trees = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int[] arr = new int[trees];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <trees; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int left = 0;
        int right = Integer.MAX_VALUE;
        int mid = (left+right)/2;
        long result;
        while(left<right){
            result = 0;
            for (int a : arr) {
                if(a>=mid){
                    result+=a-mid;
                }
            }
            if(result<length){
                right = mid;
            }else{
                left = mid+1;
            }
            mid = (left+right)/2;
        }
        System.out.println(mid-1);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[4];
        for (int i = 0; i <n; i++) {
            int num = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 4; j++) {
                if(arr[j]==0){
                    arr[j]=num;
                    break;
                }else{
                    if(arr[j]<num) {
                        arr[j]=num;
                        break;
                    }
                }
                if(j==3){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int i = arr[0];
        while(true){
            int count = 0;
            for(int a : arr){
                if(i%a==0){
                    count++;
                }
            }
            if(count>=3){
                break;
            }else{
                i++;
            }
        }
        System.out.println(i);
    }
}
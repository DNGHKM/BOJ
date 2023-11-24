import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] arr = new boolean[1_000_001];
        Arrays.fill(arr, true);
        arr[0]=false;
        arr[1]=false;
        for (int i = 2; i <=Math.sqrt(arr.length); i++) { // i = 나눠볼 인수
            for (int j = i+i; j <=1_000_000; j+=i) { //j = 전체 배열 넘버
                if(j%i==0) {
                    arr[j] = false;
                }
            }
        }
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            int input = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 0; j <=input/2; j++) {
                if(arr[j]&&arr[input-j]){
                    count++;
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        int count = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]<=m){
                count += m/arr[i];
                m%=arr[i];
            }
        }
        bw.write(count+"");
        bw.flush();
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[n+1];
        for (int i = m; i <=n; i++) {
            arr[i] = true;
        }
        for (int i = m; i <=n; i++) {
            if(arr[i]) {
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (i != j && i % j == 0) {
                        arr[i] = false;
                        break;
                    }
                }
            }
        }
        if(n>=2) {
            arr[1] = false;
        }
        for(int i =m; i<=n; i++){
            if(arr[i]){
                bw.write(i+"\n");
            }
        }
        bw.flush();
    }
}
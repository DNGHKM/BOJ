import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        for (int i = 0; i <=n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i <m; i++) {
            st = new StringTokenizer(br.readLine());
            int action = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(action == 0) {
                if(find(a)<find(b)){
                    arr[find(b)]=find(a);
                }else{
                    arr[find(a)]=find(b);
                }
            }else{
                if(find(a)==find(b)){
                    bw.write("YES\n");
                }else{
                    bw.write("NO\n");
                }
            }
        }
        bw.flush();
    }

    private static int find(int a) {
        if(arr[a]==a){
            return a;
        }else{
            return arr[a]=find(arr[a]);
        }
    }
}
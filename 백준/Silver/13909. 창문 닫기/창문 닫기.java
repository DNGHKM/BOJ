import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <=Math.sqrt(n); i++){
            if(i*i<=n){
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
    }
}
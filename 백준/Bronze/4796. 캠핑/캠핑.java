import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 1;
        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if(l==0){
                bw.flush();
                break;
            }
            bw.write("Case "+ count+": "+(v/p*l+ Math.min(v % p, l))+"\n");
            count++;
        }
    }
}
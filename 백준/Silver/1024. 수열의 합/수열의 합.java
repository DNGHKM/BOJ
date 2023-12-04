import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int nDouble = n*2;
        boolean result = false;
        for (int i=0; i <=100; i++) {
           double first = (double) (nDouble-i*i+i)/(2*i);
            if(l<=i&&!result&&first>=0&&first*10%10==0){
                for (int j = 0; j <i; j++) {
                    bw.write((int)first+" ");
                    first++;
                    result = true;
                }
            }
        }
        if(result) {
            bw.flush();
        }else{
            bw.write(-1+"");
            bw.flush();
        }
    }
}
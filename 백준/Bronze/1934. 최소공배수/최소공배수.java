import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i <t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            bw.write(a*b/GCD(a,b)+"\n");
        }
        bw.flush();
    }

    private static int GCD(int a, int b) {
        if(a%b==0){
            return b;
        }
        return GCD(b,a%b);
    }
}
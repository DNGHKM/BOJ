import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Integer.parseInt(st.nextToken());
            long m = Integer.parseInt(st.nextToken());
            if (n == 0) break;
            long num = 2;
            while (n > 0) {
                if (n * num >= m) {
                    long nextN = n * num - m;
                    long nextM = m * num;
                    //TODO 약분할것
                    long gcd = gcd(nextM, nextN);
                    nextN = nextN / gcd;
                    nextM = nextM / gcd;
                    if(nextM >= 1_000_000){
                        num++;
                        continue;
                    }
                    n = nextN;
                    m = nextM;
                    bw.write(num+" ");
                }
                if (n == 1) {
                    bw.write(m+" ");
                    break;
                } else if (n != 0) {
                    num = m / n + 1;
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }

    private static long gcd(long a, long b) {
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger p = new BigInteger(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        BigInteger zero = new BigInteger("0");
        for (int i = 2; i <k; i++) {
            BigInteger tmp = new BigInteger(String.valueOf(i));
            if(p.remainder(tmp).equals(zero)) {
                System.out.println("BAD "+i);
                return;
            }
        }
        System.out.println("GOOD");
    }
}
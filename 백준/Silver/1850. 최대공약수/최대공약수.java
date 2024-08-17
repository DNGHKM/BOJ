import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger b1 = new BigInteger(sc.next());
        BigInteger b2 = new BigInteger(sc.next());
        int n = Integer.parseInt(gcd(b1, b2));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(1);
        }
        System.out.println(sb);
    }

    private static String gcd(BigInteger b1, BigInteger b2) {
        if (b2.equals(BigInteger.ZERO)) {
            return b1.toString();
        }else{
            return gcd(b2, b1.mod(b2));
        }
    }
}
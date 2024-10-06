import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger x = (a.add(b).divide(BigInteger.valueOf(2)));
        BigInteger y = a.subtract(x);
        System.out.println(x + "\n" + y);
    }
}
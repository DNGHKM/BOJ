import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger b1 = new BigInteger(sc.next(),2);
        BigInteger b2 = new BigInteger(sc.next(),2);
        System.out.print(b1.add(b2).toString(2));
    }
}
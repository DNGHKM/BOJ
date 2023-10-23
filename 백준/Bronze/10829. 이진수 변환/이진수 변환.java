import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        binary(n);
    }
    static void binary(BigInteger i) {
        if (i.compareTo(new BigInteger("2"))<0) {
            System.out.print(i);
        }else{
            binary(i.divide(new BigInteger("2")));
            System.out.print(i.remainder(new BigInteger("2")));
        }
    }
}
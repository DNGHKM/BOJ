import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        BigInteger c = new BigInteger(sc.nextLine());
        System.out.println(b.subtract(c).divide(a));
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger c = new BigInteger(sc.next());
            BigInteger d = new BigInteger(sc.next());
            BigInteger eurecom = a.multiply(b);
            BigInteger telecomParisTech = c.multiply(d);
            if (eurecom.compareTo(telecomParisTech) < 0) {
                sb.append("Eurecom\n");
                continue;
            }
            if (eurecom.compareTo(telecomParisTech) > 0) {
                sb.append("TelecomParisTech\n");
                continue;
            }
            sb.append("Tie\n");
        }
        System.out.println(sb);
    }
}
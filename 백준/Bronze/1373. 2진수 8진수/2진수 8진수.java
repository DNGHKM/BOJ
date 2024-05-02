import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String s = sc.next();
        int num = s.length() - 1;
        while (num >= 0) {
            for (int i = 0; i < 3; i++) {
                sb.append(s.charAt(num));
                num--;
                if (num < 0) {
                    break;
                }
            }
            sb.reverse();
            sb2.append(Integer.toOctalString(Integer.valueOf(sb.toString(), 2)));
            sb = new StringBuilder();
        }
        sb2.reverse();
        System.out.println(sb2);
    }
}
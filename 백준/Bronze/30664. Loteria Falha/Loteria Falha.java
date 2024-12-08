import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true){
            String s = sc.nextLine();
            if(s.equals("0")){
                break;
            }
            if (new BigInteger(s).mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO)) {
                sb.append("PREMIADO\n");
            } else {
                sb.append("TENTE NOVAMENTE\n");
            }
        }
        System.out.println(sb);
    }
}
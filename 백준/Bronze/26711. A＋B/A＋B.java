import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(new BigInteger(sc.nextLine()).add(new BigInteger(sc.nextLine())));
    }
}

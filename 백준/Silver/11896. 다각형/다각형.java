import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (b <= 3) {
            System.out.println(0);
            return;
        }
        a = Math.max(a, 3);
        a = a % 2 == 1 ? a + 1 : a;
        b = b % 2 == 1 ? b - 1 : b;
        System.out.println((a + b) * ((b - a) / 2 + 1) / 2);
    }
}

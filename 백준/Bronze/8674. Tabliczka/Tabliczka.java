import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a % 2 == 0 || b % 2 == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(Math.min(a, b));
    }
}
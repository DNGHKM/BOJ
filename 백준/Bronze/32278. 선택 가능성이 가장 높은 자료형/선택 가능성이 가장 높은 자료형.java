import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        if (Short.MIN_VALUE <= l && l <= Short.MAX_VALUE) {
            System.out.println("short");
            return;
        }
        if (Integer.MIN_VALUE <= l && l <= Integer.MAX_VALUE) {
            System.out.println("int");
            return;
        }
        System.out.println("long long");
    }
}
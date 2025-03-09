import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b + c == 0 || a + b + c == 3) {
            System.out.println("*");
            return;
        }
        if (a + b + c == 1) {
            if (a == 1) {
                System.out.println("A");
                return;
            }
            if (b == 1) {
                System.out.println("B");
                return;
            }
            System.out.println("C");
            return;
        }
        if (a == 0) {
            System.out.println("A");
            return;
        }
        if (b == 0) {
            System.out.println("B");
            return;
        }
        System.out.println("C");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 110) {
            System.out.print(n % 10 + n / 10);
            return;
        }
        System.out.print(n % 100 + n / 100);
    }
}
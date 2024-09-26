import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, c, d;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a = i;
                c = n / i;
                for (int j = -n - 2; j < 0; j++) {
                    if (-(n + 2) % -j == 0) {
                        b = j;
                        d = -(n + 2) / j;
                        if (a * d + b * c == n + 1) {
                            System.out.println(a + " " + b + " " + " " + c + " " + d);
                            return;
                        }
                    }
                }
                for (int j = 1; j <= n+2; j++) {
                    if (n + 2 % j == 0) {
                        b = j;
                        d = -(n + 2) / j;
                        if (a * d + b * c == n + 1) {
                            System.out.println(a + " " + b + " " + " " + c + " " + d);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
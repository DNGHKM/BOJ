import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 10) {
            System.out.println(1);
            return;
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j == n) {
                    System.out.println(1);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += sc.nextInt();
            if (i < n - 1) {
                total += 8;
            }
        }
        System.out.println(total / 24 + " " + total % 24);
    }
}

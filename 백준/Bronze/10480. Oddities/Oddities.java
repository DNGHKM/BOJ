import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                sb.append(String.format("%d is even\n", num));
                continue;
            }
            sb.append(String.format("%d is odd\n", num));
        }
        System.out.println(sb);
    }
}
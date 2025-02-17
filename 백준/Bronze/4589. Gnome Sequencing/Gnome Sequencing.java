import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("Gnomes:\n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((a < b && b < c) || (a > b && b > c)) {
                sb.append("Ordered\n");
                continue;
            }
            sb.append("Unordered\n");
        }
        System.out.println(sb);
    }
}
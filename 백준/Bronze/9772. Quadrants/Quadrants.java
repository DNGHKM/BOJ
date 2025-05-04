import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (x == 0 || y == 0) {
                sb.append("AXIS\n");
                if (x == 0 && y == 0) {
                    break;
                }
                continue;
            }
            if (x > 0 && y > 0) {
                sb.append("Q1\n");
                continue;
            }
            if (x > 0 && y < 0) {
                sb.append("Q4\n");
                continue;
            }
            if (x < 0 && y > 0) {
                sb.append("Q2\n");
                continue;
            }
            if (x < 0 && y < 0) {
                sb.append("Q3\n");
                continue;
            }
        }
        System.out.println(sb);
    }
}
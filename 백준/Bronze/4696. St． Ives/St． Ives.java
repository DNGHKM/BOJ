import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            double n = sc.nextDouble();
            if (n == 0) {
                break;
            }
            double sum = 1;
            for (int i = 1; i <= 4; i++) {
                sum += Math.pow(n, i);
            }
            sb.append(String.format("%.2f\n", sum));
        }
        System.out.println(sb);
    }
}
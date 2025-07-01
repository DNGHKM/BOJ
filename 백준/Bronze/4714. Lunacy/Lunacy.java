import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            double v = sc.nextDouble();
            if (v == -1) {
                break;
            }
            sb.append(String.format("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", v, v * 167 / 1000));
        }
        System.out.println(sb);
    }
}
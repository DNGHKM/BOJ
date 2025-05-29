import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (a % b == 0) {
            System.out.println(a / b);
            return;
        }
        sb.append(a / b);
        sb.append(".");
        for (int i = 0; i < 1000; i++) {
            a = (a % b) * 10;
            sb.append(a / b);
            if ((a * 10) % b == 0) {
                break;
            }
        }
        System.out.println(sb);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            for (int j = 0; j < a; j++) {
                for (int k = 0; k <= j; k++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
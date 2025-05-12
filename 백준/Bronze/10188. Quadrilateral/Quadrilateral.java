import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < a; k++) {
                    sb.append("X");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
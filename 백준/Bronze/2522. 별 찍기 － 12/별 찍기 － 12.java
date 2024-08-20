import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            sb.append(" ".repeat(Math.max(0, Math.abs(i - n))));
            sb.append("*".repeat(Math.max(0, n - Math.abs(i - n))));
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
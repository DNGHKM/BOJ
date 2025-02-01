import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                sb.append("NO BRAINS\n");
                continue;
            }
            sb.append("MMM BRAINS\n");
        }
        System.out.println(sb);
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                sb.append((a + b) + " " + (a * b) + "\n");
            }
        }
        System.out.println(sb);
    }
}
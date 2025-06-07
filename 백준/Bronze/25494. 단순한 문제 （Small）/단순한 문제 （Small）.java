import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = Math.min(Math.min(sc.nextInt(), sc.nextInt()), sc.nextInt());
            sb.append(num + "\n");
        }
        System.out.println(sb);
    }
}

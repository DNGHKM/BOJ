import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sb.append(num + " " + num + "\n");
        }
        System.out.println(sb);
    }
}

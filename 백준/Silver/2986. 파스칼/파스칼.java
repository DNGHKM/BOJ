import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = n - 1; i >= 1; i--) {
            cnt++;
            if (n % i == 0) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
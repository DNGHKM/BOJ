import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            int sec = sc.nextInt();
            cur += sec / 4;
            cur -= sec / 7;
            sb.append(cur + "\n");
        }
        System.out.println(sb);
    }
}
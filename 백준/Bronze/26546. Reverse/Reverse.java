import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int start = sc.nextInt();
            int end = sc.nextInt();
            sb.append(s.substring(0, start) + s.substring(end) + "\n");
        }
        System.out.println(sb);
    }
}
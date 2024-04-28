import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int v = sc.nextInt();
            int e = sc.nextInt();
            sb.append(2 - v + e).append("\n");
        }
        System.out.println(sb);
    }
}
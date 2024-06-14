import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int d = sc.nextInt();
            int g = sc.nextInt();
            max = (a == d + g) ? Math.max(max, 2 * a * (d + g)) : Math.max(max, a * (d + g));
        }
        System.out.print(max);
    }
}

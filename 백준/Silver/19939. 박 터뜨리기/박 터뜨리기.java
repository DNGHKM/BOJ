import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = k * (k + 1) / 2;
        if (sum > n) {
            System.out.print(-1);
            return;
        }
        int ans = (n - sum) % k == 0 ? k - 1 : k;
        System.out.print(ans);
    }
}
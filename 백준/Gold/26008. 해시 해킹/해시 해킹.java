import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans = 1;
        for(int i = 0; i < n-1; i++){
            ans *= m;
            ans %= 1_000_000_007;
        }
        System.out.print(ans);
    }
}
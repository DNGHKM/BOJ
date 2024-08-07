import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur = sc.nextInt();
        int k = sc.nextInt();
        int ans = cur + k - 3;
        while (ans <= 0) ans += n;
        while (ans > n) ans -= n;
        System.out.println(ans);
    }
}

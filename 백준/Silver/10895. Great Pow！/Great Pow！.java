import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int ans;
        if (num % 2 == 0) {
            if (pow == 0) {
                ans = num;
            } else {
                ans = 1;
            }
        } else {
            ans = num;
        }
        System.out.print(ans);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if (num == 0) {
            System.out.println("NO");
            return;
        }
        while (num > 1) {
            if (num % 3 > 1) {
                System.out.println("NO");
                return;
            }
            num /= 3;
        }
        System.out.println("YES");
    }
}
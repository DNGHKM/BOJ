import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt = 0;
        long num = 1;
        while (n > 1) {
            cnt += (n % 7) * num;
            num *= 3;
            n /= 7;
        }
        cnt += n * num;
        System.out.println(cnt);
    }
}
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        if (n >= 28) {
            ans = (21 + n) / 7;
            if ((21 + n) % 7 != 0) {
                ans++;
            }
        } else {
            for (int i = 1; i <= 7; i++) {
                int num = (i + 1) * i / 2;
                if (num >= n) {
                    ans = i;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
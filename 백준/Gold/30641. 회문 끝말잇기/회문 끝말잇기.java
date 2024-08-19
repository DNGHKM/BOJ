import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 1 && b == 1) {
            System.out.println("H\n1");
            return;
        }
        long sumA = 0;
        long sumB = 0;
        final int MOD = 1000000007;
        long num = 1;
        for (int i = 1; i <= b; i++) {
            sumB += num;
            sumB %= MOD;
            if (i % 2 == 0) num *= 26;
            num %= MOD;
        }
        num = 1;
        for (int i = 1; i < a; i++) {
            sumA += num;
            sumA %= MOD;
            if (i % 2 == 0) num *= 26;
            num %= MOD;
        }

        if (a == 2) {
            System.out.println("H");
        } else {
            System.out.println("A");
        }
        long result = sumB - sumA;
        if (result < 0) result += MOD;
        System.out.println(result);
    }
}
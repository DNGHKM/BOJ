import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long[] f = new long[116];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f[0] = f[1] = f[2] = 1;
        for (int i = 3; i < f.length; i++) {
            f[i] = f[i - 1] + f[i - 3];
        }
        System.out.println(f[n - 1]);
    }
}
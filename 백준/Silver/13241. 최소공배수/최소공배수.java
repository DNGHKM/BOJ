import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        System.out.println(a*b/GCD(a,b));
    }
    static long GCD(long i, long j) {
        if (i % j == 0) {
            return j;
        } else {
            return GCD(j, i%j);
        }
    }
}
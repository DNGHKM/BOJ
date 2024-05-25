import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long start = n;
        if (start % 2 == 1) start += 3;
        long d = (int) Math.ceil((double) (start - 4) / 12);
        long sum = 3 * d * (d - 1);
        long num = (start / 2 + 3) % 6 + 1;
        long result = sum + d * num;
        long lastMinus = (int) (Math.floor((double) start / 2 + 2) / 6);
        result -= lastMinus;
        System.out.println(result);
    }
}
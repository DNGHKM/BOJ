import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        int n = sc.nextInt();
        if(n<=20) {
            hanoi(n, 1, 3, 2);
            System.out.print(count + "\n" + sb);
        }else{
            BigInteger b = new BigInteger("2");
            BigInteger pow = b.pow(n);
            System.out.print(pow.subtract(BigInteger.ONE));
        }
    }
    private static void hanoi(int n, int start, int end, int tmp) {
        count++;
        if (n == 1) {
            sb.append(start + " " + end + "\n");
            return;
        }
        hanoi(n - 1, start, tmp, end);
        sb.append(start + " " + end + "\n");
        hanoi(n - 1, tmp, end, start);
    }
}
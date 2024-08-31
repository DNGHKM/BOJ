import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int d = 3;
            int sum = 0;
            int num = 3;
            for (int j = 1; j <= n; j++) {
                sum += j * num;
                num += d;
                d++;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
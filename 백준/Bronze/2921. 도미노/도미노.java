import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                sum += i + j;
            }
        }
        System.out.println(sum);
    }
}

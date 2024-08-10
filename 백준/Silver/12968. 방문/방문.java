import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        if (k == 1) {
            System.out.println(1);
            return;
        }
        if (r % 2 == 0 || c % 2 == 0) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}
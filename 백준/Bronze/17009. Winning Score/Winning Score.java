import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] points = {3, 2, 1};
        int a = 0;
        int b = 0;

        for (int i = 0; i < 3; i++) {
            a += sc.nextInt() * points[i];
        }
        for (int i = 0; i < 3; i++) {
            b += sc.nextInt() * points[i];
        }
        if (b > a) {
            System.out.println("B");
        } else if (a > b) {
            System.out.println("A");
        } else {
            System.out.println("T");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 11 * 24 * 60 + 11 * 60 + 11;
        int end = sc.nextInt() * 24 * 60 + sc.nextInt() * 60 + sc.nextInt();
        if (start > end) {
            System.out.println(-1);
            return;
        }
        System.out.println(end - start);
    }
}
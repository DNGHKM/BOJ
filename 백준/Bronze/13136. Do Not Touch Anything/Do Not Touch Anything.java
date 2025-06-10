import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        int c = sc.nextInt();
        long cy = y % c == 0 ? y / c : y / c + 1;
        long cx = x % c == 0 ? x / c : x / c + 1;
        System.out.println(cx * cy);
    }
}

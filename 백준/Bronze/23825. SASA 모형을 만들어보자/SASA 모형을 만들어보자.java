import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() / 2;
        int b = sc.nextInt() / 2;
        System.out.println(Math.min(a, b));
    }
}
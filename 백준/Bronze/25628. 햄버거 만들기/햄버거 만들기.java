import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b * 2) {
            System.out.println(b);
            return;
        }
        System.out.println(a / 2);
    }
}
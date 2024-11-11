import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            String next = sc.next();
            if (next.charAt(0) != '0' && next.charAt(0) != '1') {
                System.out.println("F");
                return;
            }
        }
        System.out.println("S");
    }
}

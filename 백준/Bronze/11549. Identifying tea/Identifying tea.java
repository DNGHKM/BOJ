import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() == n) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
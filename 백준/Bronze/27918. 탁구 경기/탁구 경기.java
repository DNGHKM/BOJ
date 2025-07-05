import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int d = 0;
        int p = 0;
        for (int i = 0; i < n; i++) {
            String c = sc.nextLine();
            if (c.equals("D")) {
                d++;
            } else {
                p++;
            }
            if (d - p == 2 || p - d == 2) {
                break;
            }
        }
        System.out.println(d + ":" + p);
    }
}
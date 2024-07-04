import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int a = 1; a <= 9; a++) {
            System.out.println("? A " + a);
            int resp = sc.nextInt();
            if (resp == 1) {
                for (int b = 1; b <= 9; b++) {
                    System.out.println("? B " + b);
                    int resp2 = sc.nextInt();
                    if (resp2 == 1) {
                        System.out.println("! " + (a + b));
                        return;
                    }
                }
            }
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] xs = {sc.nextInt(), sc.nextInt()};
        int[] ys = {sc.nextInt(), sc.nextInt()};
        boolean positive = false;
        boolean negative = false;
        for (int x : xs) {
            for (int y : ys) {
                int num = a * x + b * y + c;
                if (num > 0) {
                    positive = true;
                } else if (num < 0) {
                    negative = true;
                }
            }
        }
        if ((positive && negative)) {
            System.out.println("Poor");
        } else {
            System.out.println("Lucky");
        }
    }
}
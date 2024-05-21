import java.util.*;

public class Main {
    static int n;
    static int count;
    static boolean[] existX, existDiag1, existDiag2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        existX = new boolean[n];
        existDiag1 = new boolean[2 * n - 1];
        existDiag2 = new boolean[2 * n - 1];
        count = 0;
        find(0);
        System.out.println(count);
    }

    private static void find(int y) {
        if (y == n) {
            count++;
            return;
        }

        for (int x = 0; x < n; x++) {
            if (!existX[x] && !existDiag1[y - x + n - 1] && !existDiag2[y + x]) {
                existX[x] = true;
                existDiag1[y - x + n - 1] = true;
                existDiag2[y + x] = true;

                find(y + 1);

                existX[x] = false;
                existDiag1[y - x + n - 1] = false;
                existDiag2[y + x] = false;
            }
        }
    }
}

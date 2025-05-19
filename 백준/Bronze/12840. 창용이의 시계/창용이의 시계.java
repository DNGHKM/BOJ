import java.time.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        LocalTime time = LocalTime.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            if (q == 3) {
                sb.append(String.format(("%d %d %d\n"), time.getHour(), time.getMinute(), time.getSecond()));
            }
            if (q == 1) {
                time = time.plus(Duration.ofSeconds(sc.nextInt()));
            }
            if (q == 2) {
                time = time.minus(Duration.ofSeconds(sc.nextInt()));
            }
        }
        System.out.println(sb);
    }
}
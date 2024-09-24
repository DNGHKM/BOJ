import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean[] alive = new boolean[11];
        Arrays.fill(alive, true);
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 0) {
                break;
            }
            String s = sc.nextLine();
            if (s.equals("too high")) {
                for (int i = num; i < alive.length; i++) {
                    alive[i] = false;
                }
            } else if (s.equals("too low")) {
                for (int i = 0; i <= num; i++) {
                    alive[i] = false;
                }
            } else {
                if (alive[num]) {
                    sb.append("Stan may be honest\n");
                } else {
                    sb.append("Stan is dishonest\n");
                }
                alive = new boolean[11];
                Arrays.fill(alive, true);
            }
        }
        System.out.println(sb);
    }
}
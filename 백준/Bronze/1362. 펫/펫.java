import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int caseNum = 1;
        while (true) {
            int normal = sc.nextInt();
            int current = sc.nextInt();
            if (normal == 0) {
                System.out.println(sb);
                break;
            }
            boolean alive = true;
            while (true) {
                String action = sc.next();
                int num = sc.nextInt();
                if (action.equals("#")) {
                    if (!alive) {
                        sb.append(caseNum + " RIP\n");
                        caseNum++;
                        break;
                    } else if (normal / 2 < current && current < 2 * normal) {
                        sb.append(caseNum + " :-)\n");
                        caseNum++;
                        break;
                    } else {
                        sb.append(caseNum + " :-(\n");
                        caseNum++;
                        break;
                    }
                }
                if (action.equals("F")) {
                    current += num;
                }
                if (action.equals("E")) {
                    current -= num;
                    if (current <= 0) {
                        alive = false;
                    }
                }
            }
        }
    }
}
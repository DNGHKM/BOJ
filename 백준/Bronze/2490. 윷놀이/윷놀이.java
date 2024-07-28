import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int sum = 4;
            for (int j = 0; j < 4; j++) {
                sum -= sc.nextInt();
            }
            if (sum == 0) {
                sb.append("E\n");
            } else if (sum == 4) {
                sb.append("D\n");
            } else {
                sb.append((char) (sum + 'A'-1)+"\n");
            }
        }
        System.out.println(sb);
    }
}
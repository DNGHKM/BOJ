import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int numS = 1;
        int numL = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { //2, 4
                sb.append(numS++ + " ");
            } else { //3, 4,
                sb.append(numL++ + " ");
            }
        }
        System.out.println(sb);
    }
}
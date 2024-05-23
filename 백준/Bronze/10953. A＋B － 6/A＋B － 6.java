import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <n; i++) {
            sb.append(Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).sum()).append("\n");
        }
        System.out.print(sb);
    }
}

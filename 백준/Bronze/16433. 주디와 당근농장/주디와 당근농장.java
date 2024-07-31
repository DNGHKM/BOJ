import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((r + c) % 2 == (i + j) % 2) {
                    sb.append('v');
                }else{
                    sb.append('.');
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
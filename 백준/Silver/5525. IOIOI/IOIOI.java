import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder("I");
        for (int i = 0; i < n; i++) {
            sb.append("OI");
        }
        int count = 0;
        int size = 1 + 2 * n;
        for (int i = 0; i <= s.length() - size; i++) {
            boolean flag = true;
            for (int j = 0; j < size; j++) {
                if (s.charAt(i+j) != sb.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        System.out.println(count);
    }
}

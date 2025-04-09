import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = sc.nextLine();
            if (s.equals("0")) {
                break;
            }
            int n = toInteger(s);
            int root = findRoot(n);
            while (root > 9) {
                root = findRoot(root);
            }
            sb.append(root + "\n");
        }
        System.out.println(sb);
    }

    private static int toInteger(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n += s.charAt(i) - '0';
        }
        return n;
    }

    private static int findRoot(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
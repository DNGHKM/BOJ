import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().substring(0, 5);
        int count = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (sc.next().substring(0, 5).equals(s)) count++;
        }
        System.out.print(count);
    }
}
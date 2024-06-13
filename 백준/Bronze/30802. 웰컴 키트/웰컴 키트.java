import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] shirts = new int[6];
        int s = 0;
        for (int i = 0; i < shirts.length; i++) {
            shirts[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int p = sc.nextInt();
        for (int shirt : shirts) {
            s += shirt / t;
            if(shirt % t != 0) s++;
        }
        System.out.println(s);
        System.out.println(n / p + " " + n % p);
    }
}

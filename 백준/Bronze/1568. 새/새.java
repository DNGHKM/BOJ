import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n -= num;
            num++;
            if (n < num) num = 1;
        }
        System.out.println(cnt);
    }
}
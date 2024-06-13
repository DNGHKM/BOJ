import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        int idx = -1;
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            if ('0' <= s.charAt(0) && s.charAt(0) <= '9') {
                num = Integer.parseInt(s);
                idx = i;
                break;
            }
        }
        int ans = 3 - idx + num;
        if (ans % 3 == 0 && ans % 5 == 0) {
            System.out.println("FizzBuzz");
        }else if (ans % 3 == 0) {
            System.out.println("Fizz");
        }else if (ans % 5 == 0) {
            System.out.println("Buzz");
        }else{
            System.out.println(ans);
        }
    }
}

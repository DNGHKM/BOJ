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
        num = 3 - idx + num;
        String ans = String.valueOf(num);
        if (num % 3 == 0 && num % 5 == 0) {
            ans = "FizzBuzz";
        } else if (num % 3 == 0) {
            ans = "Fizz";
        } else if (num % 5 == 0) {
            ans = "Buzz";
        }
        System.out.println(ans);
    }
}
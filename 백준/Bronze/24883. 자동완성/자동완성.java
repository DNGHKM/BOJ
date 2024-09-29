import java.util.*;

public class Main {
    public static void main(String[] args) {
        String c = new Scanner(System.in).next();
        String ans = "Naver";
        if (c.equalsIgnoreCase("N")) {
            ans += " D2";
        } else {
            ans += " Whale";
        }
        System.out.print(ans);
    }
}
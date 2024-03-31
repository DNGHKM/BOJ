import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tmp = 0;
        String input = sc.next();
        for (int i = 0; i <input.length(); i++) {
            tmp = (tmp*10+input.charAt(i)-'0')%20000303;
        }
        System.out.print(tmp);
    }
}
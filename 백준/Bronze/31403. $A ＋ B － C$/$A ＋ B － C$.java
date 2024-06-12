import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int c = sc.nextInt();
        System.out.print(Integer.parseInt(a) + Integer.parseInt(b) - c + "\n"+(Integer.parseInt(a+b)-c));
    }
}
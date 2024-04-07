import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        int a = Integer.parseInt(sb1.reverse().toString());
        int b = Integer.parseInt(sb2.reverse().toString());
        int sum = a + b;
        StringBuilder sb3 = new StringBuilder(String.valueOf(sum));
        System.out.println(Integer.parseInt(sb3.reverse().toString()));
    }
}
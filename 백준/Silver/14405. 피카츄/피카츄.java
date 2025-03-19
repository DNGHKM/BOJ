import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("pi", " ");
        s = s.replaceAll("ka", " ");
        s = s.replaceAll("chu", " ");
        if (s.trim().isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("\"\"") || s.length() < 2) {
            System.out.println("CE");
            return;
        }
        if (s.charAt(0) == '"' && s.charAt(s.length() - 1) == '"') {
            System.out.println(s.substring(1, s.length() - 1));
            return;
        }
        System.out.println("CE");
    }
}

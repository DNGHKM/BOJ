import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder("h");

        sb.append("e".repeat(Math.max(0, 2 * (s.length() - 2))));
        sb.append("y");
        System.out.println(sb);
    }
}
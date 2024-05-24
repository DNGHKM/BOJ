import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (String s : sc.nextLine().split("-")) {
            System.out.print(s.charAt(0));
        }
    }
}
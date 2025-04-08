import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "molu";
        if (s.equals("fdsajkl;") || s.equals("jkl;fdsa")) {
            ans = "in-out";
        }
        if (s.equals("asdf;lkj") || s.equals(";lkjasdf")) {
            ans = "out-in";
        }
        if (s.equals("asdfjkl;")) {
            ans = "stairs";
        }
        if (s.equals(";lkjfdsa")) {
            ans = "reverse";
        }
        System.out.println(ans);
    }
}
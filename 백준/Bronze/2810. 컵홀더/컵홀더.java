import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c = 1+s.length()-s.replace("S","").length()+(s.length()-s.replace("L","").length())/2;
        c = (n<c) ? n : c;
        System.out.print(c);
    }
}
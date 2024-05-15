import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt();
        System.out.println(Math.min((w / l) * (h / l),n));
    }
}
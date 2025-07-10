import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        String name = "";
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int num = sc.nextInt();

            if (min > num) {
                min = num;
                name = s;
            }
        }
        System.out.println(name);
    }
}
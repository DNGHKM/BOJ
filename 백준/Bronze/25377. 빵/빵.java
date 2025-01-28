import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        boolean buy = false;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a <= b) {
                min = Math.min(min, b);
                buy = true;
            }
        }
        if(!buy){
            System.out.println(-1);
            return;
        }
        System.out.println(min);
    }
}
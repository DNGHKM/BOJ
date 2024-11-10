import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {6, 3, 2, 1, 2};
        int a = 0;
        int b = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    a += sc.nextInt() * arr[j];
                } else {
                    b += sc.nextInt() * arr[j];
                }
            }
        }
        System.out.println(a + " " + b);
    }
}

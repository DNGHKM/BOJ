import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 20, 120};
        int max = 0;
        for (int i = 0; i < 3; i++) {
            max += arr[i] * sc.nextInt();
        }
        int mel = 0;
        for (int i = 0; i < 3; i++) {
            mel += arr[i] * sc.nextInt();
        }
        String ans = "Max";
        if (mel > max) {
            ans = "Mel";
        } else if (mel == max) {
            ans = "Draw";
        }
        System.out.println(ans);
    }
}
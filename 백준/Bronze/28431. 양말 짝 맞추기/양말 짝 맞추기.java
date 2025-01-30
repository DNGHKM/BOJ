import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        Arrays.fill(arr, 2);
        for (int i = 0; i < 5; i++) {
            arr[sc.nextInt()]--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == -1 || arr[i] == -3) {
                System.out.println(i);
                return;
            }
        }
    }
}

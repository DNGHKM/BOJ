import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for (int i = 1; i < arr.length; i++) {
            int next = arr[i - 1] - i;
            arr[i] = next < 0 || (set.contains(next)) ? arr[i - 1] + i : next;
            set.add(arr[i]);
        }
        System.out.print(arr[n]);
    }
}
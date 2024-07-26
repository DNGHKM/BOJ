import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = Arrays.stream(arr).sum();
        Arrays.sort(arr);
        int a = 0;
        int b = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - (arr[i] + arr[j]) == 100) {
                    a = i;
                    b = j;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == a || i == b) continue;
            System.out.println(arr[i]);
        }
    }
}
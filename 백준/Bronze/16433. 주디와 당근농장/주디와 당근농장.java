import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        Arrays.stream(arr).forEach(a -> Arrays.fill(a,'.'));
        int r = sc.nextInt();
        int c = sc.nextInt();
        fill((r + c) % 2, arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    static void fill(int num, char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i + j) % 2 == num) {
                    arr[i][j] = 'v';
                }
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = {{1}, {2, 8}, {3, 7}, {4, 6}, {5}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if ((n - nums[i][j]) % 8 == 0) {
                    System.out.print(i + 1);
                }
            }
        }
    }
}
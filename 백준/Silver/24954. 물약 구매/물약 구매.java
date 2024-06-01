import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int n, price;
    static int[] order, pills, copyPills;
    static int[][] discount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        pills = new int[n + 1];
        visited = new boolean[n];
        order = new int[n];
        price = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < pills.length; i++) {
            pills[i] = Integer.parseInt(st.nextToken());
        }
        discount = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j = 0; j < num; j++) {
                st = new StringTokenizer(br.readLine());
                int discountPill = Integer.parseInt(st.nextToken());
                int discountAmount = Integer.parseInt(st.nextToken());
                discount[i][discountPill] = Math.min(discountAmount, pills[discountPill] - 1);
            }
        }
        for (int i = 1; i <=n; i++) {
            visited = new boolean[n];
            makeOrder(i, 1);
        }
        System.out.println(price);
    }

    private static int getPrice() {
        copyPills = Arrays.copyOf(pills, pills.length);
        int sum = 0;
        for (int i : order) {
            sum += copyPills[i];
            for (int j = 1; j < discount[i].length; j++) {
                copyPills[j] = Math.max(copyPills[j] - discount[i][j], 1);
            }
        }
        return sum;
    }

    private static void makeOrder(int num, int count) {
        visited[num - 1] = true;
        order[count - 1] = num;
        if (count == n) {
            price = Math.min(price, getPrice());
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i - 1]) {
                makeOrder(i, count + 1);
                visited[i - 1] = false;
            }
        }
    }
}
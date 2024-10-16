import java.util.*;

public class Main {
    static int n;
    static int size;
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> results = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int num = n;
        size = 0;
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
            size++;
        }
        visited = new boolean[list.size()];
        backtrack(0, 0);
        Collections.sort(results);

        for (Integer i : results) {
            if (i > n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    private static void backtrack(int sum, int cur) {
        if (cur == size) {
            results.add(sum);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                sum *= 10;
                sum += list.get(i);
                backtrack(sum, cur + 1);
                sum -= list.get(i);
                sum /= 10;
                visited[i] = false;
            }
        }
    }
}
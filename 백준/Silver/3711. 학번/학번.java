import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int g = Integer.parseInt(br.readLine());
            int[] arr = new int[g];
            for (int j = 0; j < g; j++) {
                arr[j] = Integer.parseInt(br.readLine());
            }
            int div = 1;
            while (true) {
                for (int num : arr) {
                    if (set.contains(num % div)) {
                        div++;
                        set.clear();
                        break;
                    }
                    set.add(num % div);
                }
                if (set.size() == g) {
                    set.clear();
                    break;
                }
            }
            sb.append(div + "\n");
        }
        System.out.print(sb);
    }
}
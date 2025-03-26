import java.io.*;
import java.util.*;

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
                    if(set.contains(num % div)){
                        set.clear();
                        break;
                    }
                    set.add(num % div);
                }

                if (set.size() == g) {
                    set.clear();
                    break;
                }
                set.clear();
                div++;
            }
            sb.append(div + "\n");
        }
        System.out.println(sb);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            map.put(st.nextToken(), i);
        }
        List<String> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(st.nextToken());
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            String cur = list.get(i);
            for (int j = i; j < list.size(); j++) {
                if (map.get(cur) < map.get(list.get(j))) {
                    sum++;
                }
            }
        }
        System.out.println(sum + "/" + (n * (n - 1) / 2));
    }
}
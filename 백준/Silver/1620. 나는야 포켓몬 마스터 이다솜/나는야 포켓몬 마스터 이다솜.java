import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<Integer, String> hm2 = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <n; i++) {
            String input = br.readLine();
            hm1.put(input,i+1);
            hm2.put(i+1, input);
        }
        for (int i = 0; i <m; i++) {
            String input = br.readLine();
            if(hm1.containsKey(input)){
                sb.append(hm1.get(input)).append("\n");
            } else{
                sb.append(hm2.get(Integer.parseInt(input))).append("\n");
            }
        }
        System.out.println(sb);
    }
}
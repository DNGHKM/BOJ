import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> setN = new HashSet<>();
        HashSet<String> setM = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                setN.add(br.readLine());
            } else {
                setM.add(br.readLine());
            }
        }
        setN.retainAll(setM);
        ArrayList<String> result = new ArrayList<>(setN);
        sb.append(result.size()).append("\n");
        Collections.sort(result);
        for (String s : result) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> setN = new HashSet<>();
        ArrayList<String> setM = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < s + m; i++) {
            if (i < s) {
                setN.add(br.readLine());
            } else {
                setM.add(br.readLine());
            }
        }
        setM.retainAll(setN);
        System.out.println(setM.size());
    }
}

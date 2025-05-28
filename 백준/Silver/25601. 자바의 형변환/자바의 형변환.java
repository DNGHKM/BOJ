import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String child = st.nextToken();
            String parent = st.nextToken();
            map.put(child, parent);
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String curr = a;
        HashSet<String> set1 = new HashSet<>();
        while (curr != null) {
            set1.add(curr);
            curr = map.get(curr);
        }

        HashSet<String> set2 = new HashSet<>();
        curr = b;
        while (curr != null) {
            set2.add(curr);
            curr = map.get(curr);
        }


        if(set1.contains(b) || set2.contains(a)){
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            map.put(st.nextToken(),0);
        }
        for (int i = 0; i <n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            while(st2.hasMoreTokens()) {
                String input = st2.nextToken();
                int x = map.get(input);
                map.put(input, ++x);
            }
        }
        ArrayList<Map.Entry<String, Integer>> al = new ArrayList<>(map.entrySet());
        Collections.sort(al, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o2.getValue().equals(o1.getValue())){
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o2.getValue()-o1.getValue();
            }
        });
        Iterator<Map.Entry<String, Integer>> it = al.iterator();
        while(it.hasNext()){
            Map.Entry e = it.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
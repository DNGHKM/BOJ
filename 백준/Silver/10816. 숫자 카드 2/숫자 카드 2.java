import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> hm = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if(hm.containsKey(x)){
                int val = hm.get(x);
                val++;
                hm.put(x,val);
            }else{
                hm.put(x,1);
            }
        }
        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> al = new ArrayList<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i <m; i++) {
            al.add(Integer.parseInt(st2.nextToken()));;
        }
        for (int i : al) {
            if (hm.containsKey(i)) {
                sb.append(hm.get(i)).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
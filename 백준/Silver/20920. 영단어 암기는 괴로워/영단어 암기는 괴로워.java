import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i <n; i++) {
            String input = br.readLine();
            if(input.length()>=m){
                if(map.containsKey(input)){
                    map.put(input,map.get(input)+1);
                }else{
                    map.put(input, 1);
                }
            }
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (!Objects.equals(map.get(o1), map.get(o2))) {
                    return map.get(o2)-map.get(o1);
                } else{
                    if(o1.length()!=o2.length()){
                        return o2.length()-o1.length();
                    } else{
                        return o1.compareTo(o2);
                    }
                }
            }
        });
        for(String a : list){
            bw.write(a+"\n");
        }
        bw.flush();
    }
}
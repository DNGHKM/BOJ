import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();

        StringBuffer result = new StringBuffer();
        for (int i = 0; i <n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("enter")){
                hs.add(name);
            } else{
                hs.remove(name);
            }
        }
        String[] arr = hs.toArray(new String[0]);
        Arrays.sort(arr,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for(String i : arr){
            result.append(i).append("\n");
        }
        System.out.println(result);
    }
}
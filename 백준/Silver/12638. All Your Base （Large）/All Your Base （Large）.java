import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            String input = br.readLine();
            int num = 2;
            for (int j = 0; j < input.length(); j++) {
                if (j == 0) {
                    map.put(input.charAt(j), 1);
                }
                if(map.size()==1&&!map.containsKey(input.charAt(j))){
                    map.put(input.charAt(j), 0);
                }
                if(!map.containsKey(input.charAt(j))){
                    map.put(input.charAt(j), num++);
                }
            }
            int radix = Math.max(map.size(), 2);
            long digit = 1;
            long time = 0;
            for (int j = input.length() - 1; j >= 0; j--) {
                time += (map.get(input.charAt(j)) * digit);
                digit *= radix;
            }
            sb.append("Case #"+(i+1)+": "+time+"\n");
        }
        System.out.println(sb);
    }
}
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('S', 1);
        map.put('M', 2);
        map.put('L', 3);
        int[] jersey = new int[j];
        for (int i = 0; i < j; i++) {
            char c = br.readLine().charAt(0);
            jersey[i] = map.get(c);
        }
        int count = 0;
        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char size = st.nextToken().charAt(0);
            int idx = Integer.parseInt(st.nextToken())-1;
            if(jersey[idx] >= map.get(size)){
                count++;
                jersey[idx] = 0;
            }
        }
        System.out.println(count);
    }
}
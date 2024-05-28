import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] end = new int[26];
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = st.nextToken();
            arr[i] = s;
            end[s.charAt(1) - 'A']++;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            for (int j = 0; j < end.length; j++) {
                if ((j + 'A' ==s.charAt(1) && end[j] > 1)||(j + 'A' !=s.charAt(1) && end[j] > 0)) {
                    char c = s.charAt(0) >= j + 'A' ? s.charAt(0) : (char) (j + 'A');
                    set.add(c);
                }
            }
        }
        bw.write(set.size()+"\n");
        ArrayList<Character> list = new ArrayList<>(set);
        Collections.sort(list);
        for (Character c : list) {
            bw.write(c+" ");
        }
        bw.flush();
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[26];
        String input;
        while ((input = br.readLine()) != null) {
            String s1 = input.replaceAll(" ", "").trim();
            for (int i = 0; i < s1.length(); i++) {
                arr[s1.charAt(i) - 'a']++;
            }
        }
        int maxCount = Arrays.stream(arr).max().getAsInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxCount) {
                bw.write((char)('a' + i));
            }
        }
        bw.flush();
    }
}
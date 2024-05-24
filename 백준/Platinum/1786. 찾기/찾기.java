import java.io.*;
import java.util.*;

public class Main {
    static int inputLen;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        String input = br.readLine();
        inputLen = input.length();
        int[] table = makeArray(input);
        int matchCount = 0;
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < sentence.length(); i++) {
            while (j > 0 && sentence.charAt(i) != input.charAt(j)) {
                j = table[j - 1];
            }
            if(sentence.charAt(i) == input.charAt(j)){
                if(j==inputLen-1){
                    sb.append((i - inputLen + 2)).append(" ");
                    matchCount++;
                    j = table[j];
                }else{
                    j++;
                }
            }
        }
        System.out.println(matchCount);
        System.out.println(sb);
    }

    private static int[] makeArray(String input) {
        int[] arr = new int[inputLen];
        int idx = 0;
        for (int i = 1; i < inputLen; i++) {
            while (idx > 0 && input.charAt(idx) != input.charAt(i)) {
                idx = arr[idx - 1];
            }
            if (input.charAt(idx) == input.charAt(i)) {
                idx++;
                arr[i] = idx;
            }
        }
        return arr;
    }
}

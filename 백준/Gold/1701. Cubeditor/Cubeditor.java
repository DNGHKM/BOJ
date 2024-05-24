import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        int result = 0;
        for (int i = 0; i < sentence.length(); i++) {
            String input = sentence.substring(i);
            result = Math.max(result, maxCount(input));
        }
        System.out.println(result);
    }

    private static int maxCount(String input) {
        int[] table = new int[input.length()];
        int idx = 0;
        int max = 0;
        for (int i = 1; i < input.length(); i++) {
            while (idx > 0 && input.charAt(idx) != input.charAt(i)) {
                idx = table[idx - 1];
            }
            if (input.charAt(idx) == input.charAt(i)) {
                idx++;
                table[i] = idx;
                max = Math.max(table[i], max);
            }
        }
        return max;
    }
}

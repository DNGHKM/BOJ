import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        Matcher matcher = Pattern.compile("([^.?]*)([.?])").matcher(line);

        while (matcher.find()) {
            String sentence = matcher.group(1).trim();
            String punctuation = matcher.group(2);

            if (sentence.startsWith("What is") && punctuation.equals("?")) {
                sentence = sentence.replace("What", "Forty-two");
                sb.append(sentence).append(".\n");
            }
        }
        System.out.print(sb);
    }
}
